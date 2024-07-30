package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Classifying triangles.
 */

public class Exercise03_19 {

    public static void main(String[] args) {
        JTextField sideA = new JTextField(5);
        JTextField sideB = new JTextField(5);
        JTextField sideC = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter Side A:"));
        myPanel.add(sideA);
        myPanel.add(new JLabel("Enter Side B:"));
        myPanel.add(sideB);
        myPanel.add(new JLabel("Enter Side C:"));
        myPanel.add(sideC);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Classifying Triangles", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            try {
                double side1 = Double.parseDouble(sideA.getText());
                double side2 = Double.parseDouble(sideB.getText());
                double side3 = Double.parseDouble(sideC.getText());

                if(side1 == side2 && side1 == side3) {
                    message = "Those sides form an Equilateral Triangle.";
                } else if(side1 != side2 && side1 != side3 && side2 != side3) {
                    message = "Those sides form a Scalene Triangle.";
                } else {
                    message = "Those sides form an Isoceles Triangle.";
                }
            } catch (NumberFormatException e) {
                message = "Input is invalid.";
            } 
        }

        JOptionPane.showMessageDialog(null, message);
    }

}