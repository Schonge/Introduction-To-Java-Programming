package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Summing series.
 */

public class Exercise05_13 {

    public static void main(String[] args) {
        summingSeries();
    }

    public static void summingSeries() {
        String result = "i                  m(i)\n";
        double sum = 0;

        for (int i = 1; i <= 20; i++) {
            sum += i / (i + 1.0);
            result += i + "          " + String.format("       %.4f\n", sum);
        }

        JOptionPane.showMessageDialog(null, result);
    }

}