package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: computing taxes.
 */

public class Exercise03_13 {

    public static void main(String[] args) {
        JTextField statusInput = new JTextField(5);
        JTextField incomeInput = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("<html>Enter filing status:<br/>0 - Single<br/>1 - Married Jointly<br/>2 - Married Separately<br/>3 - Head of Household</html>"));
        myPanel.add(statusInput);
        myPanel.add(new JLabel("Enter taxable income:"));
        myPanel.add(incomeInput);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Computing Tax", JOptionPane.OK_CANCEL_OPTION);

        if(input == JOptionPane.OK_OPTION) {
            int status = Integer.parseInt(statusInput.getText());
            double income = Double.parseDouble(incomeInput.getText());
            double tax = 0;

            if(status == 0) { // Single filers
                if(income <= 8350) {
                    tax = income * 0.10;
                } else if(income <= 33950) {
                    tax = (8350 * 0.10) + ((income - 8350) * 0.15);
                } else if(income <= 82250) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((income - 33950) * 0.25);
                } else if(income <= 171550) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((income - 82250) * 0.28);
                } else if(income <= 372950) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((income - 171550) * 0.33);
                } else {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((income - 372590) * 0.35);
                }
            } else if(status == 1) { // Married Jointly filers
                if(income <= 16700) {
                    tax = income * 0.10;
                } else if(income <= 67900) {
                    tax = (16700 * 0.10) + ((income - 16700) * 0.15);
                } else if(income <= 137050) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((income - 67900) * 0.25);
                } else if(income <= 208850) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((income - 137050) * 0.28);
                } else if(income <= 372950) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((income - 208850) * 0.33);
                } else {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((372950 - 208850) * 0.33) + ((income - 372950) * 0.35);
                }
            } else if(status == 2) { // Married Separately filers
                if(income <= 8350) {
                    tax = income * 0.10;
                } else if(income <= 33950) {
                    tax = (8350 * 0.10) + ((income - 8350) * 0.15);
                } else if(income <= 68525) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((income - 33950) * 0.25);
                } else if(income <= 104425) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((income - 68525) * 0.28);
                } else if(income <= 186475) {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((income - 104425) * 0.33);
                } else {
                    tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((186475 - 104425) * 0.33) + ((income - 186475) * 0.35);
                }
            } else if(status == 3) { // Head of Household filers
                if(income <= 11950) {
                    tax = income * 0.10;
                } else if(income <= 45500) {
                    tax = (11950 * 0.10) + ((income - 11950) * 0.15);
                } else if(income <= 117450) {
                    tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((income - 45500) * 0.25);
                } else if(income <= 190200) {
                    tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((income - 117450) * 0.28);
                } else if(income <= 372950) {
                    tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((income - 190200) * 0.33);
                } else {
                    tax = (11950 * 0.10) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((372950 - 190200) * 0.33) + ((income - 372950) * 0.35);
                }
            } else  {
                JOptionPane.showMessageDialog(null, "ERROR: Invalid filing status.");
                System.exit(0);
            }

            JOptionPane.showMessageDialog(null, "Tax is " + (int)(tax * 100) / 100.0);
        }
    }

}