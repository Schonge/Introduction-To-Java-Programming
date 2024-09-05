package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Summing a series.
 */

public class Exercise04_24 {

    public static void main(String[] args) {
        double totalSum = 0;
        String result = "";

        int numerator = 1;
        int denominator = 2;

        while(denominator <= 100) {
            totalSum += (double)numerator / denominator;
            if(numerator == 1) {
                numerator += 1;
            } else {
                numerator += 2;
            }
            denominator += 2;
        }

        result = "Total sum of the series is " + String.format("%.2f", totalSum);
        JOptionPane.showMessageDialog(null, result);
    }

}