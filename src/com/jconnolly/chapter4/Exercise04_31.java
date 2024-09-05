package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: computing CD value.
 */

public class Exercise04_31 {

    public static void main(String[] args) {
        JTextField amountInput = new JTextField(5);
        JTextField annualYieldInput = new JTextField(5);
        JTextField monthsInput = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter Deposit Amount:"));
        myPanel.add(amountInput);
        myPanel.add(new JLabel("Enter Annual Percentage Yield:"));
        myPanel.add(annualYieldInput);
        myPanel.add(new JLabel("Enter Maturity Period(Number of Months):"));
        myPanel.add(monthsInput);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "CD Value", JOptionPane.OK_CANCEL_OPTION);

        String output = "";

        if(input == JOptionPane.OK_OPTION) {
            double amount = Double.parseDouble(amountInput.getText());
            double annualYieldRate = Double.parseDouble(annualYieldInput.getText());
            int months = Integer.parseInt(monthsInput.getText());
            // Get monthly rate as a decimal
            double monthlyIntRate = annualYieldRate / 1200;
            double totalSavings = amount;

            output += "Months       Value\n";
            for(int i = 1; i <= months; i++) {
                totalSavings *= (1 + monthlyIntRate);
                output += String.format("%5d%20.2f\n", i, totalSavings);
            }

        }

        JOptionPane.showMessageDialog(null, output);
    }

}