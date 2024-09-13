package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Math: approximating the square root.
 */

public class Exercise05_22 {

    public static void main(String[] args) {
        String result = "";

        String input = JOptionPane.showInputDialog(null, "Enter a positive number:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        double number = Double.parseDouble(input);

        result += "The square root for " + number + " is " + squareRoot(number);

        JOptionPane.showMessageDialog(null, result);
    }

    public static double squareRoot(double number) {
        double nextGuess = 1.0;
        double lastGuess;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (number / lastGuess)) * 0.5;
        } 
        while (Math.abs(nextGuess - lastGuess) >= 0.00001);

        return nextGuess;
    }

}