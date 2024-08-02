package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Repeating additions.
 */

public class Exercise04_02 {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0, count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        String result = "";

        while(count < NUMBER_OF_QUESTIONS) {
            int number1 = (int)(Math.random() * 15) + 1;
            int number2 = (int)(Math.random() * 15) + 1;

            String input = JOptionPane.showInputDialog(null, "What is " + number1 + " + " + number2 + "?",
            "Addition Quiz", JOptionPane.QUESTION_MESSAGE);

            int answer = Integer.parseInt(input);

            if(number1 + number2 == answer) {
                result = "You are correct!";
                correctCount++;
                JOptionPane.showMessageDialog(null, result);
            } else {
                result = "You are incorrect! " + number1 + " + " + number2 + " should be " + (number1 + number2);
                JOptionPane.showMessageDialog(null, result);
            }

            output += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer) ? " correct" : " wrong");

            count++;
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds \n" + output);
    }

}