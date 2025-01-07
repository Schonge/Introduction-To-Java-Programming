package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Geometry: area of a pentagon.
 */

public class Exercise05_35 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the side of a pentagon:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        double side = Double.parseDouble(input);

        String message = "The area of the pentagon is " + calculateArea(side);

        JOptionPane.showMessageDialog(null, message);
    }

    public static double calculateArea(double side) {
        return(5 * Math.pow(side, 2)) / (4 * (Math.tan((Math.PI / 5))));
    }

}