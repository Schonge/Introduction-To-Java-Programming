package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Geometry: area of a regular octagon.
 */

public class Exercise02_22 {

    public static void main(String[] args) {
        String inputSide = JOptionPane.showInputDialog(null, "Enter the length of one side:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double octagonSide = Double.parseDouble(inputSide);

        double area = 2 * (1 + Math.pow(2, 0.5)) * Math.pow(octagonSide, 2);

        String output = "The area of the octagon is: " + area;
        JOptionPane.showMessageDialog(null, output);
    }
    
}