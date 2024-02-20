package com.jconnolly.chapter3.exercises;

import javax.swing.*;
import java.awt.*;

/*
 * Algebra: solving 2 X 2 linear equations.
 */

public class Exercise03_03 {

    public static void main(String[] args) {
        JTextField aField = new JTextField(5);
        JTextField bField = new JTextField(5);
        JTextField cField = new JTextField(5);
        JTextField dField = new JTextField(5);
        JTextField eField = new JTextField(5);
        JTextField fField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("a:"));
        myPanel.add(aField);
        myPanel.add(new JLabel("b:"));
        myPanel.add(bField);
        myPanel.add(new JLabel("c:"));
        myPanel.add(cField);
        myPanel.add(new JLabel("d:"));
        myPanel.add(dField);
        myPanel.add(new JLabel("e:"));
        myPanel.add(eField);
        myPanel.add(new JLabel("f:"));
        myPanel.add(fField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter a, b, c, d, e, f:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());
            double d = Double.parseDouble(dField.getText());
            double e = Double.parseDouble(eField.getText());
            double f = Double.parseDouble(fField.getText());

            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            String message;
            if(((a * d) - (b * c)) == 0) {
                message = " The equation has no solution";
            } else {
                message = "x is " + x + " and y is " + y;
            }
;
            JOptionPane.showMessageDialog(null, message);
        }
    }
    
}