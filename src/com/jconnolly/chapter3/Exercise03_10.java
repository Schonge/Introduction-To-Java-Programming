package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Game: addition quiz.
 */

public class Exercise03_10 {

    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        int sum = number1 + number2;
        String message = "";

        String input = JOptionPane.showInputDialog(null, "What is " + number1 + " + " + number2 + "? ",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int answer = Integer.parseInt(input);

        if(answer == (sum)) {
            message = "You are CORRECT!";
        } else {
            message = "You are INCORRECT! \nThe correct answer is " + sum + ".";
        }
        
        JOptionPane.showMessageDialog(null, message);
    }

}