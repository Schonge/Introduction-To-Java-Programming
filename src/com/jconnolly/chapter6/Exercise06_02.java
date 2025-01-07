package com.jconnolly.chapter6;

import javax.swing.JOptionPane;

/*
 * Reversing the numbers entered.
 */

public class Exercise06_02 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            String num = JOptionPane.showInputDialog(null, "Enter an integer number:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            numbers[i] = Integer.parseInt(num);
        }

        String message = "The numbers entered in reverse are " + reverseNumbers(numbers);

        JOptionPane.showMessageDialog(null, message);
    }

    public static String reverseNumbers(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];
        int j = numbers.length - 1;
        String result = "";

        for(int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[j];
            j--;
            result += reverseNumbers[i] + " ";
        }

        return result;
    }

}