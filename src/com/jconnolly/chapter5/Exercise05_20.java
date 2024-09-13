package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Using trigonometric methods.
 */

public class Exercise05_20 {

    public static void main(String[] args) {
        String result = "Degree     Sin     Cos\n";

        for (int degree = 0; degree <= 360; degree += 10) {
            result += degree + "            " + String.format("%.2f", Math.sin(degree * Math.PI / 180)) + "             " +
            String.format("%.2f", Math.cos(degree * Math.PI / 180)) + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}