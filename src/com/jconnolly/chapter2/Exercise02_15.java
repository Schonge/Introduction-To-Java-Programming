package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Financial application: compound value.
 */

public class Exercise02_15 {

    public static void main(String[] args) {
        String inputSavings = JOptionPane.showInputDialog(null, "Enter monthly savings:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double monthlySavings = Double.parseDouble(inputSavings);

        String inputIntRate = JOptionPane.showInputDialog(null, "Enter annual interest rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double annualRate = Double.parseDouble(inputIntRate) / 100;

        double monthlyRate = annualRate / 12;
        double month1 = monthlySavings * (1 + monthlyRate);
        double month2 = (month1 + monthlySavings) * (1 + monthlyRate);
        double month3 = (month2 + monthlySavings) * (1 + monthlyRate);
        double month4 = (month3 + monthlySavings) * (1 + monthlyRate);
        double month5 = (month4 + monthlySavings) * (1 + monthlyRate);
        double month6 = (month5 + monthlySavings) * (1 + monthlyRate);

        String output = "The account value after the sixth month is " + month6;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
