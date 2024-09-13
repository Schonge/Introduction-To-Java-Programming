package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Displaying matrix of 0s and 1s.
 */

public class Exercise05_17 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the matrix size (e.g 3 is a 3 x 3 matrix):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int n = Integer.parseInt(input);

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        String result = "";

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                result += (int)(Math.random() * 2) + " ";
            }
            result += "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}