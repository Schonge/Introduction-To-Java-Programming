package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Converting Celsius to Fahrenheit.
 */

public class Exercise02_01 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a degree in Celsius:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int celsius = Integer.parseInt(input);
        double fahrenheit = (9.0/5.0) * celsius + 32.0;

        String output = celsius + " Celsius is " + fahrenheit + " Fahrenheit";
        JOptionPane.showMessageDialog(null, output);
    }
    
}