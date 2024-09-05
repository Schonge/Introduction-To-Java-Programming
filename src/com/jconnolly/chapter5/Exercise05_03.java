package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Palindrome integer.
 */

public class Exercise05_03 {

    public static void main(String[] args) {
        String result = "";

        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);

        if(isPalindrome(number)) {
            result = number + " is a palindrome";
        } else {
            result = number + " is not palindrome";
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static int reverse(int number) {
        int temp = number;
        int reversedNum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp = temp / 10;
        }
        return reversedNum;
    }

    public static boolean isPalindrome(int number) {
        if(number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

}