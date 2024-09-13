package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Using the Math.sqrt method.
 */

public class Exercise05_18 {

    public static void main(String[] args) {
        String result = "";

        result += String.format("%-15s%-15s\n", "Number", "SquareRoot");

        for(int n = 0; n <= 20; n += 2) {
            result += String.format("%-23s%-23s\n", n, String.format("%.4f", Math.sqrt(n)));
        }

        JOptionPane.showMessageDialog(null, result);
    }

}