package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: loan amoritization schedule.
 */

public class Exercise04_22 {

    public static void main(String[] args) {
        JTextField loanAmount = new JTextField(5);
        JTextField numberOfYears = new JTextField(5);
        JTextField interestRate = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Loan Amount:"));
        myPanel.add(loanAmount);
        myPanel.add(new JLabel("Number of Years:"));
        myPanel.add(numberOfYears);
        myPanel.add(new JLabel("Annual Interest Rate:"));
        myPanel.add(interestRate);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Loan Amoritization Schedule", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double amount = Double.parseDouble(loanAmount.getText());
            int years = Integer.parseInt(numberOfYears.getText());
            double intRate = Double.parseDouble(interestRate.getText());
            // Get monthly rate as a decimal
            double monthlyIntRate = intRate / 1200;
            // Calculate the monthly and total payments
            double monthlyPayment = amount * monthlyIntRate / (1 - 1 / Math.pow(1 + monthlyIntRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            message += "Monthly Payment: " + String.format("%.2f", monthlyPayment) + "\n"
            + "Total Payment: " + String.format("%.2f", totalPayment) + "\n"
            + "Payment #    Interest    Principal   Balance\n";

            double balance = totalPayment;
            double principal;

            for(int i = 1; i <= years * 12; i++) {
                double interest = monthlyIntRate * balance;
                principal = monthlyPayment - interest;
                balance = balance - principal;

                message += String.format("%1d                     %4.2f          %4.2f       %.2f", i, interest, principal, balance) + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}