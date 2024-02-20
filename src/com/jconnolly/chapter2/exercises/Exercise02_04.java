package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Converting pounds into kilograms.
 */

public class Exercise02_04 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number in pounds:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double pounds = Double.parseDouble(input);
        double kilograms = pounds * 0.454;

        String output = pounds + " pounds is " + kilograms + " kilograms";
        JOptionPane.showMessageDialog(null, output);
    }
    
}