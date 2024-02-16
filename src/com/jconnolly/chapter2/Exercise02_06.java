package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Multiplying the digits in an integer.
 */

public class Exercise02_06 {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer between 100 and 999:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int number = Integer.parseInt(input);
        
        int digit1, digit2, digit3;
        digit1 = number % 10;
        digit2 = (number / 10) % 10;
        digit3 = (number / 100);

        int product = digit1 * digit2 * digit3;

        String output = "The product of the digits is " + product + ".";
        JOptionPane.showMessageDialog(null, output);
    }

}