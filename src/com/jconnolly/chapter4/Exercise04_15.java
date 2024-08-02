package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Computing the greatest common divisor.
 */

public class Exercise04_15 {

    public static void main(String[] args) {
        JTextField number1Field = new JTextField(5);
        JTextField number2Field = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter an integer:"));
        myPanel.add(number1Field);
        myPanel.add(new JLabel("Enter an integer:"));
        myPanel.add(number2Field);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Greatest Common Divisor", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int number1 = Integer.parseInt(number1Field.getText());
            int number2 = Integer.parseInt(number2Field.getText());
            //Get the lowest of the two submitted numbers to check for the gcd
            int min;
            
            if(number1 <= number2) {
                min = number1;
            } else {
                min = number2;
            }

            // Initial greatest common divisor is 1
            int gcd = 1;
            for(int i = min; i >= 1; i--) {
                if(number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                    break;
                }
            }

            message = "The greatest common divisior of " + number1 + " and " + number2 + " is " + gcd;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}