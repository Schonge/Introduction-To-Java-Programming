package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Financial application: computing future tuition.
 */

public class Exercise04_07 {

    public static void main(String[] args) {
        double initialTuition = 10000;
        final double TUITION_INCREASE_PERCENTAGE = 0.05;
        int yearCount = 2;
        double tuition = initialTuition;
        String message = "";

        while(yearCount <= 10) {
            tuition += tuition * TUITION_INCREASE_PERCENTAGE;
            yearCount++;
        }
        message = "Tuition after 10 years will cost $" + String.format("%.2f", tuition);
        JOptionPane.showMessageDialog(null, message);

        int uniYearCount = 2;
        double totalTuitionCost = tuition;

        while(uniYearCount <= 4) {
            tuition += tuition * TUITION_INCREASE_PERCENTAGE;
            totalTuitionCost += tuition;
            uniYearCount++;
        }
        
        message = "The total tuition cost for 4 years of university is $" + String.format("%.2f", totalTuitionCost);
        JOptionPane.showMessageDialog(null, message);
    }

}