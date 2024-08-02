package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Counting positive and negative numbers and computing the average of numbers.
 */

public class Exercise04_01 {

    public static void main(String[] args) {
        int number;
        String result = "";
        int positives = 0, negatives = 0, total = 0, counter = 0;
        double average = 0;

        do {
            String input = JOptionPane.showInputDialog(null, "Enter an integer:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);

            number = Integer.parseInt(input);

            if(number > 0) {
                positives++;
                counter++;
            } else if(number < 0) {
                negatives++;
                counter++;
            }

            total = total + number;
            average = (double) total / counter;
        } while (number != 0);

        result = "The number of positives is " + positives + "\nThe number of negatives is " + negatives + "\nThe total is " + total
        + "\nThe average is " + average;
        
        JOptionPane.showMessageDialog(null, result);        
    }

}