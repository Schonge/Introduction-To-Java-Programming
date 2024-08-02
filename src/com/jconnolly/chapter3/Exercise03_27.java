package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: points in a triangle?
 */

public class Exercise03_27 {

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
        "Check if Point is in Triangle", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double x = Double.parseDouble(xField.getText());
            double y = Double.parseDouble(yField.getText());

            // Working with the instruction that the that the right angle of the triangle is positioned at point (0, 0)
            double x1 = 0, y1 = 0;
            double x2 = 200, y2 = 0;
            double x3 = 0, y3 = 100;

            // Calculate the area of the original triangle using determinant method
            double originalArea = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

            // Calculate the area of the triangle formed by the point and two vertices of the triangle
            double area1 = 0.5 * Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
            double area2 = 0.5 * Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
            double area3 = 0.5 * Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));

            if(originalArea == area1 + area2 + area3) {
                message = "The point (" + x + ", " + y + ") is in the triangle.";
            } else {
                message = "The point (" + x + ", " + y + ") is not in the triangle.";
            }           
        }

        JOptionPane.showMessageDialog(null, message);
    }

}