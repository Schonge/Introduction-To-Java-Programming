package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Physics: acceleration.
 */

public class Exercise02_23 {

    public static void main(String[] args) {
        String inputV0 = JOptionPane.showInputDialog(null, "Enter v0:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double v0 = Double.parseDouble(inputV0);

        String inputV1 = JOptionPane.showInputDialog(null, "Enter v1:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double v1 = Double.parseDouble(inputV1);

        String inputT = JOptionPane.showInputDialog(null, "Enter t:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double t = Double.parseDouble(inputT);

        double acceleration = (v1 - v0) / t;

        String output = "The average acceleration is " + acceleration;
        JOptionPane.showMessageDialog(null, output);
    }
    
}