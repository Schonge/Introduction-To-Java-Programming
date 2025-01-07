package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: area of a regular polygon.
 */

public class Exercise05_36 {

    public static void main(String[] args) {
        JTextField numOfSidesField = new JTextField(5);
        JTextField sideLengthField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter number of sides:"));
        myPanel.add(numOfSidesField);
        myPanel.add(new JLabel("Enter side length:"));
        myPanel.add(sideLengthField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Get Area of Polygon", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int numOfSides = Integer.parseInt(numOfSidesField.getText());
            double sideLength = Double.parseDouble(sideLengthField.getText());

            message = "The area of the polygon is " + area(numOfSides, sideLength);
        }

        JOptionPane.showMessageDialog(null, message);
    }

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

}