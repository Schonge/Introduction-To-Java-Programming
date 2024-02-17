package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Geometry: area of a triangle.
 */

public class Exercise02_21 {

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

        String inputX3 = JOptionPane.showInputDialog(null, "Enter x3:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double x3 = Double.parseDouble(inputX3);

        String inputY3 = JOptionPane.showInputDialog(null, "Enter y3:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double y3 = Double.parseDouble(inputY3);

        double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5);
        double side3 = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5);
        double s = (side1 + side2 + side3) / 2; // s = semi-perimeter of the triangle
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        String output = "The area of the triangle is " + area;
        JOptionPane.showMessageDialog(null, output);
    }
    
}