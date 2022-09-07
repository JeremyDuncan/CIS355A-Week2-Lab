package com.jeremy.lab2.lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

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
                    JOptionPane.showMessageDialog(null, "Cleared");
                }
                else if (e.getSource() == btnDisplay) {
                    JOptionPane.showMessageDialog(null, "Display");
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


