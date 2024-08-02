package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Finding the smallest n such that n^2 > 15,000.
 */

public class Exercise04_12 {

    public static void main(String[] args) {
        int n = 0;
        String result = "";

        while(n * n <= 15000) {
            n++;
        }
        
        result = "The smallest n such that n^2 is > 15,000 is " + n + "\nn^2 is " + (n * n);

        JOptionPane.showMessageDialog(null, result);
    }

}