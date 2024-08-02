package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: two circles.
 */

public class Exercise03_29 {

    public static void main(String[] args) {
        JTextField circle1X = new JTextField(5);
        JTextField circle1Y = new JTextField(5);
        JTextField circle1Radius = new JTextField(5);
        JTextField circle2X = new JTextField(5);
        JTextField circle2Y = new JTextField(5);
        JTextField circle2Radius = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter x coordinate for C1's center:"));
        myPanel.add(circle1X);
        myPanel.add(new JLabel("Enter y coordinate for C1's center:"));
        myPanel.add(circle1Y);
        myPanel.add(new JLabel("Enter radius for C1:"));
        myPanel.add(circle1Radius);
        myPanel.add(new JLabel("Enter x coordinate for C2's center:"));
        myPanel.add(circle2X);
        myPanel.add(new JLabel("Enter y coordinate for C2's center:"));
        myPanel.add(circle2Y);
        myPanel.add(new JLabel("Enter radius for C2:"));
        myPanel.add(circle2Radius);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Check Two Circles", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double c1x = Double.parseDouble(circle1X.getText());
            double c1y = Double.parseDouble(circle1Y.getText());
            double c1Radius = Double.parseDouble(circle1Radius.getText());
            double c2x = Double.parseDouble(circle2X.getText());
            double c2y = Double.parseDouble(circle2Y.getText());
            double c2Radius = Double.parseDouble(circle2Radius.getText());

            // Need to dcalculate distance between circle's center points
            // Rectangle 1
            double distance = Math.sqrt(Math.pow((c2x - c1x), 2) + Math.pow((c2y - c1y), 2));            

            if(distance <= Math.abs(c1Radius - c2Radius)) {
                message = "Circle2 is inside Circle1";
            } else if(distance <= c1Radius + c2Radius) {
                message = "Circle2 overlaps Circle1";
            } else {
                message = "Circle2 is not inside and does not overlap Circle1";
            }        
        }

        JOptionPane.showMessageDialog(null, message);
    }

}