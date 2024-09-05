package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Displaying an integer reversed.
 */

public class Exercise05_04 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int number = Integer.parseInt(input);

        reverse(number);
    }

    public static void reverse(int number) {
        String result = "";
        int temp = number;
        int reversedNum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp = temp / 10;
        }

        result = number + " reversed is " + reversedNum;
        JOptionPane.showMessageDialog(null, result);
    }

}