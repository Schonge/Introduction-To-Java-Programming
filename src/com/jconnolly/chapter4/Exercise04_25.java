package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Computing pi.
 */

public class Exercise04_25 {

    public static void main(String[] args) {
        double pi = 0;
        String result = "";

        for(int i = 0; i <= 100000; i++) {
            double temp = 1.0 / (2 * i + 1);
            if(i % 2 == 1) {
                temp = -temp;
            }
            pi += temp;
            if(i % 10000 == 0) {
                result += "For i  = " + i + " the value of pi is " + String.format("%.6f", (4 * pi)) + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}