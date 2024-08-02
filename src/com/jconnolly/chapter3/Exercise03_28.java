package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Geometry: two rectangles.
 */

public class Exercise03_28 {

    public static void main(String[] args) {
        JTextField rectangle1X = new JTextField(5);
        JTextField rectangle1Y = new JTextField(5);
        JTextField rectangle1Width = new JTextField(5);
        JTextField rectangle1Height = new JTextField(5);
        JTextField rectangle2X = new JTextField(5);
        JTextField rectangle2Y = new JTextField(5);
        JTextField rectangle2Width = new JTextField(5);
        JTextField rectangle2Height = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter x coordinate for R1's center:"));
        myPanel.add(rectangle1X);
        myPanel.add(new JLabel("Enter y coordinate for R1's center:"));
        myPanel.add(rectangle1Y);
        myPanel.add(new JLabel("Enter width for R1:"));
        myPanel.add(rectangle1Width);
        myPanel.add(new JLabel("Enter height for R1:"));
        myPanel.add(rectangle1Height);
        myPanel.add(new JLabel("Enter x coordinate for R2's center:"));
        myPanel.add(rectangle2X);
        myPanel.add(new JLabel("Enter y coordinate for R2's center:"));
        myPanel.add(rectangle2Y);
        myPanel.add(new JLabel("Enter width for R2:"));
        myPanel.add(rectangle2Width);
        myPanel.add(new JLabel("Enter height for R2:"));
        myPanel.add(rectangle2Height);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Check Two Triangles", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double r1x = Double.parseDouble(rectangle1X.getText());
            double r1y = Double.parseDouble(rectangle1Y.getText());
            double r1Width = Double.parseDouble(rectangle1Width.getText());
            double r1Height = Double.parseDouble(rectangle1Height.getText());
            double r2x = Double.parseDouble(rectangle2X.getText());
            double r2y = Double.parseDouble(rectangle2Y.getText());
            double r2Width = Double.parseDouble(rectangle2Width.getText());
            double r2Height = Double.parseDouble(rectangle2Height.getText());

            // Need to define the rectangles by their bottom-left and top-right corners
            // Rectangle 1
            double rect1_blc_x = r1x - (r1Width / 2);
            double rect1_blc_y = r1y - (r1Height / 2);
            double rect1_trc_x = r1x + (r1Width / 2);
            double rect1_trc_y = r1y + (r1Height / 2);
            // Rectangle 2
            double rect2_blc_x = r2x - (r2Width / 2);
            double rect2_blc_y = r2y - (r2Height / 2);
            double rect2_trc_x = r2x + (r2Width / 2);
            double rect2_trc_y = r2y + (r2Height / 2);
            

            if(rect1_blc_x > rect2_trc_x || rect1_trc_x < rect2_blc_x || rect1_blc_y > rect2_trc_y || rect1_trc_y < rect2_blc_y) {
                message = "Rectangle2 does not overlap Rectangle1";
            } else if(rect2_blc_x >= rect1_blc_x && rect2_trc_x <= rect1_trc_x && rect2_blc_y >= rect1_blc_y && rect2_trc_y <= rect1_trc_y) {
                message = "Rectangle2 is inside Rectangle1";
            } else {
                message = "Rectangle2 overlaps Rectangle1";
            }        
        }

        JOptionPane.showMessageDialog(null, message);
    }

}