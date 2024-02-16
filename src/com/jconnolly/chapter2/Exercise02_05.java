package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Financial application: calculating tips.
 */

public class Exercise02_05 {

    public static void main(String[] args) {
        String inputSubtotal = JOptionPane.showInputDialog(null, "Enter the subtotal:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double subtotal = Double.parseDouble(inputSubtotal);

        String inputGratuity = JOptionPane.showInputDialog(null, "Enter the gratuity rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double gratuityPercent = Double.parseDouble(inputGratuity) / 100;

        double gratuity = subtotal * gratuityPercent;
        double total = subtotal + gratuity;

        String output = "The gratuity is " + gratuity + " and total is " + total;
        JOptionPane.showMessageDialog(null, output);
    }
    
}