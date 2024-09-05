package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Summation.
 */

public class Exercise04_35 {

    public static void main(String[] args) {
        double summation = 1 / (1 + Math.sqrt(2));

        for(int i = 2; i < 625; i++) {
            summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        JOptionPane.showMessageDialog(null, summation);
    }

}