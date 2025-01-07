package com.jconnolly.chapter6;

import javax.swing.JOptionPane;

/*
 * Counting occurrence of numbers.
 */

public class Exercise06_03 {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        int temp = 0;
        int i = 0;
        do {
            String gradeInput = JOptionPane.showInputDialog(null, "Enter a number between 1 and 100 (Enter a 0 to exit):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            temp = Integer.parseInt(gradeInput);
            numbers[i] = temp;
            i++;
        } while (temp != 0);

        String message = checkOccurrences(numbers);

        JOptionPane.showMessageDialog(null, message);        
    }

    public static String checkOccurrences(int[] numbers) {
        String result = "";
        for(int i = 1; i <= 100; i++) {
            int count = 0;
            for(int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j] == i) {
                    count += 1;
                }
            }
            if(count != 0) {
                result += i + " occurs " + count  + " " + (count > 1 ? "times" : "time") + ".\n";
            }
        }

        return result;
    }
}