package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Obtaining more accurate results.
 */

public class Exercise04_23 {

    public static void main(String[] args) {
        String output = "";
        double result1 = 0.0, result2 = 0.0;

        output += "Computing from left to right we get the result:\n";
        for(int i = 1; i <= 50000; i++) {
            result1 += 1.0 / i;
        }
        output += "Total sum: " + result1 + "\n";

        output += "Computing from right to left we get the result:\n";
        for(int i = 50000; i >= 1; i--) {
            result2 += 1.0 / i;
        }
        output += "Total sum: " + result2 + "\n";

        double difference = result2 - result1;
        output += "Loss of accuracy from left to right was: " + difference;

        JOptionPane.showMessageDialog(null, output);
    }

}