package com.jconnolly.chapter3.exercises;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Game: learning addition.
 */

public class Exercise03_04 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        int sum = num1 + num2;

        String inputAnswer = JOptionPane.showInputDialog(null, "What is the sum of " + num1 + " + " + num2,
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int answer = Integer.parseInt(inputAnswer);
        String result;
        if(sum == answer) {
            result = "True";
        } else {
            result = "False";
        }

        JOptionPane.showMessageDialog(null, result);
    }
    
}