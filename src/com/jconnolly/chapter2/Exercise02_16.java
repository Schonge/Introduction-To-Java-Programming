package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Science: calculating energy.
 */

public class Exercise02_16 {
    
    public static void main(String[] args) {
        String inputWaterWeight = JOptionPane.showInputDialog(null, "Enter amount of water in kilograms:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double waterWeight = Double.parseDouble(inputWaterWeight);

        String inputInitTemp = JOptionPane.showInputDialog(null, "Enter the initial temperature:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double initTemp = Double.parseDouble(inputInitTemp);

        String inputFinalTemp = JOptionPane.showInputDialog(null, "Enter the final temperature:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double finalTemp = Double.parseDouble(inputFinalTemp);

        double energy = waterWeight * (finalTemp - initTemp) * 4184;

        String output = "The energy needed is " + energy;
        JOptionPane.showMessageDialog(null, output);
    }

}