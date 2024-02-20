package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Health application: computing BMI.
 */

public class Exercise02_14 {
    
    public static void main(String[] args) {
        String inputWeight = JOptionPane.showInputDialog(null, "Enter weight in pounds:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double weight = Double.parseDouble(inputWeight);

        String inputHeight = JOptionPane.showInputDialog(null, "Enter height in inches:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double height = Double.parseDouble(inputHeight);

        // Convert weight and height to kilos and meters during the BMI calculation
        double bmi = (weight * 0.45359237) / (height * 0.0254);

        String output = "BMI is " + bmi;
        JOptionPane.showMessageDialog(null, output);
    }

}