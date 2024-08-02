package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Find the largest n such that n^3 < 15,000.
 */

public class Exercise04_13 {

    public static void main(String[] args) {
        int n = 0;
        String result = "";

        while(n * n * n < 15000) {
            n++;
        }
        // Loop breaks when it gets to 15,000 or larger so we need to reduce n by 1 to get the largest n^3 less than 15,000
        n--;
        
        result = "The largest n such that n^3 is < 15,000 is " + n + "\nn^3 is " + (n * n * n);

        JOptionPane.showMessageDialog(null, result);
    }

}