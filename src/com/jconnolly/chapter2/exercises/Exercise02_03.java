package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Converting centimeters into inches.
 */

public class Exercise02_03 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter centimeters as an integer:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int centimeters = Integer.parseInt(input);
        double inches = centimeters * 0.3937;

        String output = "The value in inches is " + inches + ".";
        JOptionPane.showMessageDialog(null, output);

    }
    
}