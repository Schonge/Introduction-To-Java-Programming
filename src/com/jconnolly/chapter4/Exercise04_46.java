package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Computer architecture: bit-level operations.
 */

public class Exercise04_46 {

    public static void main(String[] args) {
        String result = "";
        int mask = 1;

        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);
        result += "The bits are ";
        for (int i = 15; i >= 0; i--) {
            int temp = number >> i;
            int bit = temp & mask;
            result += bit;
        }

        JOptionPane.showMessageDialog(null, result);
    }

}