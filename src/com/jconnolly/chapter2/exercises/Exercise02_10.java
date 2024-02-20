package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Using the GUI input.
 * 
 * Did this in Exercise02_09 also.
 * I have been using the GUI instead of the scanner for these exercises.
 */

public class Exercise02_10 {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an amount in integer, for example 1156:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int amount = Integer.parseInt(input);

        int numberOfDollars = amount / 100;
        int remaining = amount % 100;
        int numberOfQuarters = remaining / 25;
        remaining = remaining % 25;
        int numberOfDimes = remaining / 10;
        remaining = remaining % 10;
        int numberOfNickels = remaining / 5;
        remaining = remaining % 5;
        int numberOfPennies = remaining;

        String output = "Your amount " + amount + " consists of\n" + numberOfDollars + " dollars\n" + numberOfQuarters + " quarters\n"
        + numberOfDimes + " dimes\n" + numberOfNickels + " nickels\n" + numberOfPennies + " pennies";
        JOptionPane.showMessageDialog(null, output);
    }

}