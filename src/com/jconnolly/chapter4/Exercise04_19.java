package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Printing numbers in a pyramid pattern.
 */

public class Exercise04_19 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int rows = 8;
        
        for (int i = 0; i <= rows; i++) {
            // Leading spaces
            for (int j = i; j < rows; j++) {
                result.append("       ");
            }
            // Ascending
            for (int k = 0; k < i; k++) {
                if (Math.pow(2, k) >= 10 && Math.pow(2, k) < 100) {
                    // Remove space for numbers between 10 and 99
                    result.append(String.format("%5d", (int)Math.pow(2, k)));
                } else if (Math.pow(2, k) >= 100 && Math.pow(2, k) < 200) {
                    // Remove space for numbers between 100 and 200
                    result.append(String.format("%4d", (int)Math.pow(2, k)));
                } else {
                    result.append(String.format("%6d", (int)Math.pow(2, k)));
                }
            }
            // Descending
            for (int l = i - 2; l >= 0; l--) {
                if (Math.pow(2, l) >= 10 && Math.pow(2, l) < 100) {
                    // Add extra space for numbers between 10 and 99
                    result.append(String.format("%4d", (int)Math.pow(2, l)));
                } else {
                    result.append(String.format("%5d", (int)Math.pow(2, l)));
                }
            }
            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

}