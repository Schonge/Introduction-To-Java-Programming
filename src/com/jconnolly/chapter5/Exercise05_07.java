package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: computing the future investment value.
 */

public class Exercise05_07 {

    public static void main(String[] args) {
        JTextField investmentAmountField = new JTextField(5);
        JTextField interestRateField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Investment Amount:"));
        myPanel.add(investmentAmountField);
        myPanel.add(new JLabel("Interest Rate:"));
        myPanel.add(interestRateField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Future Investment Value:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double investmentAmount = Double.parseDouble(investmentAmountField.getText());
            double interestRate = Double.parseDouble(interestRateField.getText());

            double monthlyInterestRate = (interestRate / 100) / 12;
            int years = 30;

            String result = "Years      Future Value\n";
            for(int i = 1; i <= years; i++) {
                result += i + "             " + String.format("%.2f", futureInvestmentValue(investmentAmount, monthlyInterestRate, i)) + "\n";
            }

            JOptionPane.showMessageDialog(null, result);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

}