package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Perfect number.
 */

public class Exercise04_33 {

    public static void main(String[] args) {
        String result = "";
        for(int i = 1; i <= 10000; i++) {
            int sum = 0;
            // Exclude the number itself
            int divisor = i - 1;
            while(divisor > 0) {
                if(i % divisor == 0) {
                    sum += divisor;
                }
                divisor--;
            }
            // Check if sum of divisors equals the number
            if(i == sum) {
                result += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}