package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Financial application: calculating interest.
 */

public class Exercise02_12 {
    
    public static void main(String[] args) {
        String inputBalance = JOptionPane.showInputDialog(null, "Enter balance:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double balance = Double.parseDouble(inputBalance);

        String inputIntRate = JOptionPane.showInputDialog(null, "Enter annual interest rate (e.g., 5.2 for 5.2%):",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double interestRate = Double.parseDouble(inputIntRate);

        double interest = balance * (interestRate / 1200);

        String output = "The interest is " + interest + " and the new balance is " + (balance + interest) + ".";
        JOptionPane.showMessageDialog(null, output);
    }

}