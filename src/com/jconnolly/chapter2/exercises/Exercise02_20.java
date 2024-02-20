package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Geometry: distance of two points.
 */

public class Exercise02_20 {

    public static void main(String[] args) {
        String inputX1 = JOptionPane.showInputDialog(null, "Enter x1:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double x1 = Double.parseDouble(inputX1);

        String inputY1 = JOptionPane.showInputDialog(null, "Enter y1:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double y1 = Double.parseDouble(inputY1);

        String inputX2 = JOptionPane.showInputDialog(null, "Enter x2:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double x2 = Double.parseDouble(inputX2);

        String inputY2 = JOptionPane.showInputDialog(null, "Enter y2:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double y2 = Double.parseDouble(inputY2);

        double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

        String output = "The distance of the two points is " + distance;
        JOptionPane.showMessageDialog(null, output);
    }
    
}