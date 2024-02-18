package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Checking whether a number is odd.
 */

public class Exercise03_02 {

    public static void main(String[] args) {
        String inputNumber = JOptionPane.showInputDialog(null, "Enter an integer:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int number = Integer.parseInt(inputNumber);
        
        String result;
        if(number % 2 == 0) {
            result = "False";
        } else {
            result = "True";
        }

        String output = "Is " + number + " an odd number? " + result;
        JOptionPane.showMessageDialog(null, output);
    }
    
}