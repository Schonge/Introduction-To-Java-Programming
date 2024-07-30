package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Checking a number.
 */

public class Exercise03_12 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int number = Integer.parseInt(input);
        String message = "";

        if(number % 3 == 0 && number % 4 == 0) {
            message = number + " is divisible by both 3 and 4.";
        } else if(number % 3 == 0 || number % 4 == 0) {
            message = number + " is divisible by 3 or 4, but not both.";
        } else {
            message = number + " is not divisible by either 3 or 4.";
        }

        JOptionPane.showMessageDialog(null, message);
    }

}