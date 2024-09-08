package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Displaying characters.
 */

public class Exercise05_12 {

    public static void main(String[] args) {
        

        String input = JOptionPane.showInputDialog(null, "Enter a lowercase letter:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        char lowercase = input.charAt(0);

        printUppercase(lowercase);
    }

    public static void printUppercase(char lowercase) {
        String result = "The uppercase value of " + lowercase + " is " + Character.toUpperCase(lowercase);

        JOptionPane.showMessageDialog(null, result);
    }

}