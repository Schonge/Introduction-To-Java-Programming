package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Computing the volume of a cylinder.
 */

public class Exercise02_02 {

    public static void main(String[] args) {
        String inputRadius = JOptionPane.showInputDialog(null, "Enter the radius of a cylinder:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double radius = Double.parseDouble(inputRadius);

        String inputLength = JOptionPane.showInputDialog(null, "Enter the length of a cylinder:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double length = Double.parseDouble(inputLength);

        double area = radius * radius * 3.14159;
        double volume = area * length;

        String output = "The area is " + area + "\nThe volume is " + volume;
        JOptionPane.showMessageDialog(null, output);
    }
    
}