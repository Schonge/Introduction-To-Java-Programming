package com.jconnolly.chapter4;

import javax.swing.*;

/*
 * Displaying pyramid
 */

public class Exercise04_17 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the number of lines(1 - 15):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);
        String result = "";

        if(number < 1 || number > 15) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
        } else {
            for(int i = 1; i <= number; i++) {
                // Print leading spaces
                for(int j = number - i; j > 0; j--) {
                    result += "   ";
                }
                // Print decreasing numbers
                for(int k = i; k > 1; k--) {
                    result += k + " ";
                }
                // Print increasing numbers
                for(int l = 1; l <= i; l++) {
                    result += l + " ";
                }
                result += "\n";
            }

        }

        JOptionPane.showMessageDialog(null, result);
    }

}