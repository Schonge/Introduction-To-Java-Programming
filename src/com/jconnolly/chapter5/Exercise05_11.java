package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Financial application: computing commissions.
 */

public class Exercise05_11 {

    public static void main(String[] args) {
        String result = "Sales Amount           Commission\n";

        for (int sales = 10000; sales <= 100000; sales += 5000) {
            result += sales + "                         " + String.format("%.2f", computeCommission(sales)) + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;
        
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            salesAmount -= 5000;
            commission = (5000 * 0.08) + (salesAmount * 0.10);
        } else if (salesAmount > 10000) {
            commission = (5000 * 0.08);
            salesAmount -= 5000;

            commission += (5000 * 0.10);
            salesAmount -= 5000;

            commission += salesAmount * 0.12;
        }

        return commission;
    }

}