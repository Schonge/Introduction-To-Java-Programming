package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Occurrences of a min number.
 */

public class Exercise04_41 {

    public static void main(String[] args) {
        int number;
        int min = 0, count = 0;
        String result = "";

        do {
            String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);

            number = Integer.parseInt(input);
            
            if(number > 0) {
                if(min == 0) {
                    min = number;
                    count++;
                }
                
                if(number < min) {
                    min = number;
                    count = 1;
                } else if(number == min) {
                    count++;
                }
            }
        } while (number != 0);

        result = "The smallest number is " + min + "\n" +
        "The occurrence count of the smallest number is " + count + "\n";

        JOptionPane.showMessageDialog(null, result);
    }

}