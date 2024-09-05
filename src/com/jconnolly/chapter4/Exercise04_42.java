package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Financial application: finding the sales amount.
 */

public class Exercise04_42 {

    public static void main(String[] args) {
        double sales = 0, commission = 0;
        String result = "";

        String input = JOptionPane.showInputDialog(null, "Enter Commission Sought:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        double reqCommission = Double.parseDouble(input);

        double salesLimit = 5000; // Initial sales limit for level 1
        double rate = 0.08; // Initial commission rate for level 1

        for (int level = 1; reqCommission > 0; level++) {
            double commissionLimit = salesLimit * rate;
            
            if (reqCommission <= commissionLimit) {
                sales += reqCommission / rate;
                commission += reqCommission;
                break;
            } else {
                reqCommission -= commissionLimit;
                sales += salesLimit;
                commission += commissionLimit;
            }
            
            // Update rate and sales limit for the next commission level
            if (level == 1) {
                rate = 0.10; // Next level rate
            } else if (level == 2) {
                rate = 0.12; // Final rate for all amounts above $10,000
                salesLimit = Double.MAX_VALUE; // No more sales limits
            }
        }

        result += "Minimum Sales Required: $" + String.format("%.2f", sales) + "\n";
        result += "Total Commission Earned: $" + String.format("%.2f", commission) + "\n";

        JOptionPane.showMessageDialog(null, result);
    }

}