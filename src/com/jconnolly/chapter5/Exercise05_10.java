package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Using the isPrime method.
 */

public class Exercise05_10 {

    public static void main(String[] args) {
        int count = 0;
        String result = "";

        for(int i = 2; i < 10000; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        
        result = "The number of prime numbers less than 10000 is " + count;

        JOptionPane.showMessageDialog(null, result);
    }

    public static boolean isPrime(int number) {
        for(int divisor = 2; divisor <= number / 2; divisor++) {
            if(number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}