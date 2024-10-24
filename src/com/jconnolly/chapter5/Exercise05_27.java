package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Emirp.
 */

public class Exercise05_27 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int i = 2; perLineCounter <= 100; i++) {
            if(isEmirp(i)) {
                // JOptionPane does not format the alignment for the first four rows.
                result += String.format("%8d", i) + " ";
                perLineCounter++;

                if(perLineCounter % 10 == 0) {
                    result += "\n";
                }
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

    public static int reversal(int number) {
        int result = 0;
    
        while(number != 0) {
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }
    
        return result;
    }

    public static boolean isPalindrome(int number) {
        return number == reversal(number);
    }

    public static boolean isEmirp(int number) {
        // Check that number length is greater than 1
        String s = String.valueOf(number);
        if(isPrime(number) && !isPalindrome(number) && isPrime(reversal(number)) && s.length() > 1) {
            return true;
        } else {
            return false;
        }
        
    }

}