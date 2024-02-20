package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Financial application: payroll.
 */

public class Exercise02_11 {

    public static void main(String[] args) {
        String inputName = JOptionPane.showInputDialog(null, "Enter employee's name:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        String empName = inputName;

        String inputHrsWorked = JOptionPane.showInputDialog(null, "Enter number of hours worked in a week:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double hrsWorked = Double.parseDouble(inputHrsWorked);

        String inputPayRate = JOptionPane.showInputDialog(null, "Enter hourly pay rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double payRate = Double.parseDouble(inputPayRate);

        String inputFedTax = JOptionPane.showInputDialog(null, "Enter federal tax witholding rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double fedTaxRate = Double.parseDouble(inputFedTax);

        String inputStateTax = JOptionPane.showInputDialog(null, "Enter state tax witholding rate:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double stateTaxRate = Double.parseDouble(inputStateTax);

        double grossPay = payRate * hrsWorked;
        double fedWitholding = grossPay * fedTaxRate;
        double stateWitholding = grossPay * stateTaxRate;
        double totalDeduction = fedWitholding + stateWitholding;
        double netPay = grossPay - totalDeduction;

        String output = "Employee Name: " + empName + "\nHours Worked: " + hrsWorked + "\nPay Rate: " + payRate + "\nGross Pay: "
        + grossPay + "\nDeductions:\n" + "   Federal Witholding (" + (fedTaxRate * 100) + "%): $"  + fedWitholding + 
        "\n   State Witholding (" + (stateTaxRate * 100) + "%): $" + stateWitholding + "\n   Total Deduction: $" + totalDeduction
        + "\nNet Pay: $" + netPay;
        JOptionPane.showMessageDialog(null, output);
    }
    
}