package com.jconnolly.chapter3.exercises;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Game: picking the lowest integer.
 */

public class Exercise03_05 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int num3 = rand.nextInt(100);

        int lowest;
        if(num1 <= num2 && num1 <= num3) {
            lowest = num1;
        } else if(num2 <= num1 && num2 <= num3) {
            lowest = num2;
        } else {
            lowest = num3;
        }

        String inputAnswer = JOptionPane.showInputDialog(null, "which number is lowest " + num1 + ", " + num2 + ", or " + num3 + "?",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int answer = Integer.parseInt(inputAnswer);

        String result;
        if(answer == lowest) {
            result = "True";
        } else {
            result = "False";
        }

        JOptionPane.showMessageDialog(null, result);
    }
    
}