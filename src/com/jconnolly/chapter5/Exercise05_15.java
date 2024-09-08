package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Financial application: printing a tax table.
 */

public class Exercise05_15 {

    public static void main(String[] args) {
        String result = "Taxable        Single          Married           Married         Head of\n";
        result += "Income                               Joint               Separate        a House\n";

        for (int i = 50000; i <= 60000; i += 50) {

            result += i + "             " + Math.round(computeTax(0, i)) +
            "               " + Math.round(computeTax(1, i)) +
            "               " + Math.round(computeTax(2, i)) +
            "               " + Math.round(computeTax(3, i)) + "\n";
        }

        JTextArea textArea = new JTextArea(result);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));

        JOptionPane.showMessageDialog(null, scrollPane, "Printing a Tax Table", JOptionPane.YES_NO_OPTION);
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        int taxRate10 = 0, taxRate15 = 0, taxRate25 = 0, taxRate28 = 0, taxRate33 = 0;

        // Single filers
        if(status == 0) {
            taxRate10 = 8350;
            taxRate15 = 33950;
            taxRate25 = 82250;
            taxRate28 = 171550;
            taxRate33 = 372950;
        // Married or Joint filers
        } else if(status == 1) {
            taxRate10 = 16700;
            taxRate15 = 67900;
            taxRate25 = 137050;
            taxRate28 = 208850;
            taxRate33 = 372950;
        // Married Separate filers
        } else if(status == 2) {
            taxRate10 = 8350;
            taxRate15 = 33950;
            taxRate25 = 68525;
            taxRate28 = 104425;
            taxRate33 = 186475;
        // Head of a House filer
        } else if(status == 3) {
            taxRate10 = 11950;
            taxRate15 = 45500;
            taxRate25 = 117450;
            taxRate28 = 190200;
            taxRate33 = 372950;
        } else {
            JOptionPane.showMessageDialog(null, "INVALID STATUS");
        }

        if(taxableIncome <= taxRate10) {
            tax = taxableIncome * 0.10;
        } else if(taxableIncome <= taxRate15) {
            tax = taxRate10 * 0.10 + (taxableIncome - taxRate10) * 0.15;
        } else if(taxableIncome <= taxRate25) {
            tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxableIncome - taxRate15) * 0.25;
        } else if(taxableIncome <= taxRate28) {
            tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
                    + (taxableIncome - taxRate25) * 0.28;
        } else if(taxableIncome <= taxRate33) {
            tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
                    + (taxRate28 - taxRate25) * 0.28 + (taxableIncome - taxRate28) * 0.33;
        } else {
            tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
                    + (taxRate28 - taxRate25) * 0.28 + (taxRate33 - taxRate28) * 0.33 + (taxableIncome - taxRate33) * 0.35;
        }

        return tax;
    }

}