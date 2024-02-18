package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Algebra: solving quadratic equations.
 */

public class Exercise03_01 {

    public static void main(String[] args) {
        JTextField aField = new JTextField(5);
        JTextField bField = new JTextField(5);
        JTextField cField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("a:"));
        myPanel.add(aField);
        myPanel.add(new JLabel("b:"));
        myPanel.add(bField);
        myPanel.add(new JLabel("c:"));
        myPanel.add(cField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter a, b, c:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());

            double r1 = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);

            String message;
            if(r1 == r2) {
                message = "The root is " + r1;
            } else if(Double.isNaN(r1) && Double.isNaN(r2)) {
                message = "The equation has no real roots";
            } else {
                message = "The roots are " + r1 + " and " + r2;
            }

            JOptionPane.showMessageDialog(null, message);
        }
    }
    
}