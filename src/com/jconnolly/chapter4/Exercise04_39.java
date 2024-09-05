package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Financial application: finding the sales amount.
 */

public class Exercise04_39 {

    public static void main(String[] args) {
        String result = "";
        double baseSalary = 5000;
        final double SALES_TARGET = 30000;
        double reqCommission = SALES_TARGET - baseSalary;
        double sales = 0, commission = 0;

        if(reqCommission > 0) {
            double commissionLvl1 = 5000 * 0.08;
            if(reqCommission <= commissionLvl1) {
                sales = reqCommission / 0.08;
                commission = reqCommission;
                result += "Minimum Sales Required: $" + String.format("%.2f", sales) + "\n";
                result += "Commission Earned: $" + String.format("%.2f", commission) + "\n";
            } else {
                reqCommission -= commissionLvl1;
                sales += 5000;
                commission += commissionLvl1;
            }
        }
        
        // Calculate commission on next $5,000
        if (reqCommission > 0) {
            double commissionLvl2 = 5000 * 0.10;
            if (reqCommission <= commissionLvl2) {
                sales += reqCommission / 0.10;
                commission += reqCommission;
                result += "Minimum Sales Required: $" + String.format("%.2f", sales) + "\n";
                result += "Commission Earned: $" + String.format("%.2f", commission) + "\n";
            } else {
                reqCommission -= commissionLvl2;
                sales += 5000;
                commission += commissionLvl2;
            }
        }
        
        // Calculate commission on amount above $10,000
        if (reqCommission > 0) {
            sales += reqCommission / 0.12;
            commission += reqCommission;
        }
        
        result += "Minimum Sales Required: $" + String.format("%.2f", sales) + "\n";
        result += "Commission Earned: $" + String.format("%.2f", commission) + "\n";

        JOptionPane.showMessageDialog(null, result);
    }

}