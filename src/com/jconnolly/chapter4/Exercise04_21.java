package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: comparing loans with various interest rates.
 */

public class Exercise04_21 {

    public static void main(String[] args) {
        JTextField loanAmount = new JTextField(5);
        JTextField numberOfYears = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Loan Amount:"));
        myPanel.add(loanAmount);
        myPanel.add(new JLabel("Number of Years:"));
        myPanel.add(numberOfYears);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Compare Loans", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double amount = Double.parseDouble(loanAmount.getText());
            int years = Integer.parseInt(numberOfYears.getText());

            message = "Interest Rate        Monthly Payment     Total Payment\n";

            for(double i = 5.0; i <= 8.0; i += 0.125) {
                // Get monthly rate as a decimal
                double monthlyInterestRate = i / 1200;
                // Calculate the monthly and total payments
                double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
                double totalPayment = monthlyPayment * years * 12;

                message += i + "%" + "              " + String.format("%.2f", monthlyPayment) + "              " 
                + String.format("%.2f", totalPayment) + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}