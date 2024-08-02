package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: point in a rectangle?
 */

public class Exercise03_23 {

    public static void main(String[] args) {
        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter x coordinate:"));
        myPanel.add(xField);
        myPanel.add(new JLabel("Enter y coordinate:"));
        myPanel.add(yField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Check if Point is in Rectangle", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double x = Double.parseDouble(xField.getText());
            double y = Double.parseDouble(yField.getText());

            // Working with the assumption that the rectangle is centered at point (0, 0)
            double rectangleWidth = 10;
            double rectangleHeight = 5;

            if(x <= rectangleWidth / 2 && y <= rectangleHeight / 2) {
                message = "Point (" + x + ", " + y + ") is in the rectangle.";
            } else {
                message = "Point (" + x + ", " + y + ") is not in the rectangle.";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}