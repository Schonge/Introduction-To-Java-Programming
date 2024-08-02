package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Finding the factors of an integer.
 */

public class Exercise04_16 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a positive integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);
        String result = "";

        for(int i = number; i >= 1; i--) {
            if(number % i == 0) {
                if(i != 1) {
                    result += i  + ", ";
                } else {
                    result += "and " + i;
                }
                
            }
        }

        JOptionPane.showMessageDialog(null, "The factors of " + number + " are " + result);
    }

}