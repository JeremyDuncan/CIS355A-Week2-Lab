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

                if (e.getSource() == btnClear) {

                    txtName.setText("");
                    txtAge.setText("");
                    txtWeight.setText("");
                    txtHeightFeet.setText("");
                    txtHeightInches.setText("");
                    txtBMI.setText("");
                    JOptionPane.showMessageDialog(null, "Cleared");


                }
                else if (e.getSource() == btnDisplay) {
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

                    String name = txtName.getText();
                    int age = Integer.parseInt(txtAge.getText());
                    double weight = Double.parseDouble(txtWeight.getText());
                    int feet = Integer.parseInt(txtHeightFeet.getText());
                    double inches = Double.parseDouble(txtHeightInches.getText());

                    HealthProfile profile = new HealthProfile(name, age, weight, feet, inches);

                    double bmi = profile.calculateBMI();
                    DecimalFormat fmt = new DecimalFormat("0.0");
                    txtBMI.setText(fmt.format(bmi));
                    txtCategory.setText(profile.calculateCategory());
                    txtMaxHeartRate.setText("" + profile.calculateMaxHR());

                }

            }
        };
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


