package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Game: rolling a die.
 */

public class Exercise03_14 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Guess the number of a rolled die:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int guess = Integer.parseInt(input);
        int dieRoll = (int)(Math.random() * 6) + 1;
        String message = "";

        if(guess == dieRoll) {
            message = "Congratulations! You guessed correctly.";
        } else {
            message = "Unlucky! You guessed incorrectly.";
        }

        JOptionPane.showMessageDialog(null, "The die rolled a " + dieRoll + ".\n" + message);
    }

}