package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Mersenne prime.
 */

public class Exercise05_28 {

    public static void main(String[] args) {
        String result = "p          2^p - 1\n";

        for(int p = 2; p <= 31; p++) {
            int i = (int)(Math.pow(2, p) - 1);

            if (isPrime(i)) {
              result += (p + "          " + i + "\n");
            }
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