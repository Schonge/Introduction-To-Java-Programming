package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Physics: finding a runway length.
 */

public class Exercise02_24 {

    public static void main(String[] args) {
        String inputV = JOptionPane.showInputDialog(null, "Enter v:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double v = Double.parseDouble(inputV);

        String inputA = JOptionPane.showInputDialog(null, "Enter a:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double a = Double.parseDouble(inputA);

        double length = Math.pow(v, 2) / (2 * a);

        String output = "The minimum runway length for this airplane is " + length;
        JOptionPane.showMessageDialog(null, output);
    }
    
}