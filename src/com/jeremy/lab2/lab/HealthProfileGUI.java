package com.jeremy.lab2.lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.text.DecimalFormat;

public class HealthProfileGUI {
    private JPanel form;
    private JLabel lblName;
    private JTextField txtName;
    private JButton btnDisplay;
    private JButton btnClear;
    private JTextField txtAge;
    private JTextField txtWeight;
    private JTextField txtHeightFeet;
    private JTextField txtHeightInches;
    private JLabel lblBMI;
    private JLabel lblCategory;
    private JLabel lblMaxHeartRate;
    private JTextField txtBMI;
    private JTextField txtCategory;
    private JTextField txtMaxHeartRate;
    private JLabel lblAge;
    private JLabel lblWeight;
    private JLabel lblHeightFeet;
    private JLabel lblHeightInches;


    public HealthProfileGUI() {
        ActionListener ButtonPress = new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                // If Clear Button is pressed clear all text fields and alert user of cleared screen
                if (e.getSource() == btnClear) {

                    // Clears all the text fields
                    txtName.setText("");
                    txtAge.setText("");
                    txtWeight.setText("");
                    txtHeightFeet.setText("");
                    txtHeightInches.setText("");
                    txtBMI.setText("");
                    txtCategory.setText("");
                    txtMaxHeartRate.setText("");

                    // Displays alrt showing the text boxes were cleared
                    JOptionPane.showMessageDialog(null, "Cleared");

                    //Puts focus on name text field
                    txtName.requestFocus();


                }
                // If Display Button is pressed, verify all text fields have data entered
                // then calculate BMI, Category, and Max Heart Rate
                else if (e.getSource() == btnDisplay) {
                    // Shows alert if name, age, weight, or height text fields are empty
                    if(txtName.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                        txtName.requestFocus();
                        return;
                    }
                    if(txtAge.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Age is required", "Error", JOptionPane.ERROR_MESSAGE);
                        txtAge.requestFocus();
                        return;
                    }
                    if(txtWeight.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Weight is required", "Error", JOptionPane.ERROR_MESSAGE);
                        txtWeight.requestFocus();
                        return;
                    }
                    if(txtHeightFeet.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Height in feet is required", "Error", JOptionPane.ERROR_MESSAGE);
                        txtHeightFeet.requestFocus();
                        return;
                    }
                    if(txtHeightInches.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Height in inches is required", "Error", JOptionPane.ERROR_MESSAGE);
                        txtHeightInches.requestFocus();
                        return;
                    }

                    // pulls data from text field and places into variables to be used
                    String name = txtName.getText();
                    int age = Integer.parseInt(txtAge.getText());
                    double weight = Double.parseDouble(txtWeight.getText());
                    int feet = Integer.parseInt(txtHeightFeet.getText());
                    double inches = Double.parseDouble(txtHeightInches.getText());

                    // Creates profile from HealthProfile class in HealthProfile.java
                    // Adds input values from text field variables just created and utilizes them for class constructor
                    HealthProfile profile = new HealthProfile(name, age, weight, feet, inches);

                    // Calls class method to calculate BMI from user input
                    double bmi = profile.calculateBMI();
                    DecimalFormat fmt = new DecimalFormat("0.0");
                    txtBMI.setText(fmt.format(bmi));
                    txtCategory.setText(profile.calculateCategory());
                    txtMaxHeartRate.setText("" + profile.calculateMaxHR());

                }

            }
        };

        // Calls ButtonPress ActionListener depending on which button is pressed
        btnClear.addActionListener(ButtonPress);
        btnDisplay.addActionListener(ButtonPress);
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Health Profile App");
        frame.setContentPane(new HealthProfileGUI().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}


