package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * The MyTriangle class.
 */

public class Exercise05_19 {

    public static void main(String[] args) {
        String result = "";

        JTextField side1Text = new JTextField(5);
        JTextField side2Text = new JTextField(5);
        JTextField side3Text = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Side 1:"));
        myPanel.add(side1Text);
        myPanel.add(new JLabel("Side 2:"));
        myPanel.add(side2Text);
        myPanel.add(new JLabel("Side 3:"));
        myPanel.add(side3Text);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "MyTriangle Class:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double side1 = Double.parseDouble(side1Text.getText());
            double side2 = Double.parseDouble(side2Text.getText());
            double side3 = Double.parseDouble(side3Text.getText());

            if(isValid(side1, side2, side3)) {
                result += "The area of the triangle is " + String.format("%.2f", area(side1, side2, side3));
            } else {
                result += "The values provided do not make a valid triangle!";
            }

            JOptionPane.showMessageDialog(null, result);
        }  
    }

    public static boolean isValid(double side1, double side2, double side3) {
        if(side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2; // s = semi-perimeter of the triangle
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

}