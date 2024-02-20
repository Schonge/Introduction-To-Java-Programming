package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Finding the character of an ASCII code.
 */

public class Exercise02_08 {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an ASCII code:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int asciiCode = Integer.parseInt(input);
        char letter = (char)asciiCode;

        String output = "The character for ASCII code " + asciiCode + " is " + letter;
        JOptionPane.showMessageDialog(null, output);
    }

}