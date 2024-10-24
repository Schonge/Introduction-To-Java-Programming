package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Twin primes.
 */

public class Exercise05_30 {

    public static void main(String[] args) {
        String result = "";
        int count = 0;
        int num = 2;

        while (count < 50) {
            if (isPrime(num) && isPrime(num + 2)) {
                result += "(" + num + ", " + (num + 2) + ")" + "\n";
                count++;
            }
            num++;
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}