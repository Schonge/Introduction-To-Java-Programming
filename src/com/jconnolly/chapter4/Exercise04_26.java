package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Computing e.
 */

public class Exercise04_26 {

    public static void main(String[] args) {        
        String result = "";

        int i = 10000;
        while(i <= 100000) {
            double e = 0;
            double denominator = 1;

            for(int j = 0; j <= i; j++) {
                if(j > 0) {
                    denominator *= j;
                }
                e += 1.0 / denominator;
            }
            result += "When i is " + i + " the approximation of e is " + String.format("%.6f", e) + "\n";
            i += 10000;
        }

        JOptionPane.showMessageDialog(null, result);
    }

}