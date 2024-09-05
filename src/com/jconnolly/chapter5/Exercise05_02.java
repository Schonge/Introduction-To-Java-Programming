package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Summing the digits in an integer.
 */

public class Exercise05_02 {

    public static void main(String[] args) {
        String result = "";

        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);
        result = "The sum of the digits of the provided number is " + sumDigits(number);

        JOptionPane.showMessageDialog(null, result);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        // Get the absolute value of number provided.
        int temp = (int)Math.abs(n);

        while(temp != 0) {
            int remainder = temp % 10;
            sum += remainder;
            temp = temp / 10;
        }

        return sum;
    }

}