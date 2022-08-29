package week.pkg1.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Week1Lab {

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scan = new Scanner(System.in);

        //loop until user gives an 'x'
        String name = "";
        while (name.equalsIgnoreCase("X") == false) {
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();

            if (name.equalsIgnoreCase("X") == false) {
                System.out.print("Enter age: ");
                int age = scan.nextInt();

                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();

                System.out.print("Enter height - feet: ");
                int feet = scan.nextInt();

                System.out.print("Enter height - inches: ");
                double inches = scan.nextDouble();
                scan.nextLine();

                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                System.out.println("\nHealth profile for " + hp.getName());

                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0");

                System.out.println("BMI: " + fmt.format(bmi));
                System.out.println("BMI Category: " + hp.calculateCategory());
                System.out.println("Max Heart Rate: " + hp.calculateMaxHR());
                System.out.println();
            }
        }


    }
}
