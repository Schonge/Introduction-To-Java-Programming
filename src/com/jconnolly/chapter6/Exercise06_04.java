package com.jconnolly.chapter6;

import javax.swing.JOptionPane;

/*
 * Analyzing scores.
 */

public class Exercise06_04 {

    public static void main(String[] args) {
        double[] scores = new double[10];
        double temp = 0;
        double sum = 0;
        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            String scoreInput = JOptionPane.showInputDialog(null, "Enter a number between 1 and 100 (Enter a negative number to exit or max 10 scores):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            temp = Double.parseDouble(scoreInput);
            if(i == scores.length || temp < 0) {
                break;
            }
            scores[i] = temp;
            count++;
            sum += temp;            
        }

        double average = sum / count;

        int aboveOrEqual = 0;
        for(int j = 0; j < count; j++) {
            if(scores[j] >= average) {
                aboveOrEqual++;
            }
        }

        String message = "The average score is " + average + ".\n" +
            "The number of scores above or equal the average is " + aboveOrEqual + ".\n" +
            "The number of scores below the average is " + (count - aboveOrEqual) + ".";

        JOptionPane.showMessageDialog(null, message);
    }

}