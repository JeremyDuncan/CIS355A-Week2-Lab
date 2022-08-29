package week.pkg1.lab;

public class HealthProfile {
        //attributes
        private String name;
        private int age;
        private double weight;
        private double height;

        //constructors



        //behaviors


        //getters and setters
        private void setName(String name) {
            this.name = name;
        }

        private void setAge(int age) {
            this.age = age;
        }

        private void setWeight(double weight) {
            this.weight = weight;
        }

        private void setHeight(double feet, double inches) {
            this.height = ((feet / 12) + inches);
        }

}
