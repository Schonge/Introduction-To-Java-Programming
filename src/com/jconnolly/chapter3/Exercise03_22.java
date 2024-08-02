package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: point in a circle?
 */

public class Exercise03_22 {

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
        "Check if Point is in Circle", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double x = Double.parseDouble(xField.getText());
            double y = Double.parseDouble(yField.getText());

            // Center point of the circle with a radius of 10
            double x1 = 0;
            double y1 = 0;

            // Distance between two points formula
            double distance = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));

            if(distance <= 10) {
                message = "Point (" + x + ", " + y + ") is in the circle.";
            } else {
                message = "Point (" + x + ", " + y + ") is not in the circle.";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}