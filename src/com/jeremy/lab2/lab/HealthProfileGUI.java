package com.jeremy.lab2.lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Health Profile App");
        frame.setContentPane(new HealthProfileGUI().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

