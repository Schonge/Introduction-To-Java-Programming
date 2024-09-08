package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Computing a series.
 */

public class Exercise05_14 {

    public static void main(String[] args) {
        computingSeries();
    }

    public static void computingSeries() {
        String result = "i                  m(i)\n";
        double sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += Math.pow(-1, i + 1) / i;
            if(i % 5 == 0) {
                result += i + "          " + String.format("         %.5f\n", sum);
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}