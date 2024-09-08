package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Displaying patterns.
 */

public class Exercise05_06 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int lineNumber = Integer.parseInt(input);

        displayPattern(lineNumber);
    }

    public static void displayPattern(int n) {
        String result = "";
        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int i = row; i < n; i++) {
                result += "   ";
            }
            // Print numbers
            for (int i = row; i >= 1; i--) {
                result += " " + i;
            }
      
            result += "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}