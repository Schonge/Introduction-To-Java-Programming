package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Financial application: calculating the future investment value.
 */

public class Exercise02_13 {

    public static void main(String[] args) {
        String inputInvestment = JOptionPane.showInputDialog(null, "Enter investment amount:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double investmentAmount = Double.parseDouble(inputInvestment);

        String inputMonthlyIntRate = JOptionPane.showInputDialog(null, "Enter monthly interest rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double monthlyInterestRate = Double.parseDouble(inputMonthlyIntRate) / 100;

        String inputYears = JOptionPane.showInputDialog(null, "Enter number of years:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int years = Integer.parseInt(inputYears);

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        String output = "Accumulated value is " + futureInvestmentValue;
        JOptionPane.showMessageDialog(null, output);
    }
}