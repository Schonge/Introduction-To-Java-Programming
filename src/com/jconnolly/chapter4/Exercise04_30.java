package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: compund value.
 */

public class Exercise04_30 {

    public static void main(String[] args) {
        JTextField amountInput = new JTextField(5);
        JTextField annualRateInput = new JTextField(5);
        JTextField monthsInput = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Savings Amount:"));
        myPanel.add(amountInput);
        myPanel.add(new JLabel("Annual Interest Rate:"));
        myPanel.add(annualRateInput);
        myPanel.add(new JLabel("Number of Months:"));
        myPanel.add(monthsInput);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Compound Value", JOptionPane.OK_CANCEL_OPTION);

        String output = "";

        if(input == JOptionPane.OK_OPTION) {
            double amount = Double.parseDouble(amountInput.getText());
            double annualIntRate = Double.parseDouble(annualRateInput.getText());
            int months = Integer.parseInt(monthsInput.getText());
            // Get monthly rate as a decimal
            double monthlyIntRate = annualIntRate / 1200;
            double totalSavings = 0;

            for(int i = 1; i <= months; i++) {
                totalSavings = (amount + totalSavings) * (1 + monthlyIntRate);
            }

            output = "After the " + months + " months, the account value is " + String.format("%.2f", totalSavings);
        }

        JOptionPane.showMessageDialog(null, output);
    }

}