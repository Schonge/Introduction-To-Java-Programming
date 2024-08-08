package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Printing prime numbers between 2 and 1500.
 */

public class Exercise04_20 {

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 15;
        int count = 0;
        int number = 2;
        String result = "";
        
        while(number <= 1500) {
            boolean isPrime = true;

            for(int divisor = 2; divisor <= number / 2; divisor++) {
                if(number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                count++;
                if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    result += number + "\n";
                } else {
                    result += number + " ";
                }
            }

            number++;
        }

        JOptionPane.showMessageDialog(null, result);
    }

}