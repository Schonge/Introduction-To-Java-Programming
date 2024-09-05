package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Decimal to binary.
 */

public class Exercise04_37 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
        "Decimal to Binary", JOptionPane.QUESTION_MESSAGE);

        int decimal = Integer.parseInt(input);
        StringBuilder binary = new StringBuilder();

        // Convert to binary
        while(decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }

        // Need to reverse the binary
        JOptionPane.showMessageDialog(null, binary.reverse().toString());
    }

}