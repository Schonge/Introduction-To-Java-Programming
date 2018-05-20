package com.jconnolly.chapter2;

/**
 * Financial Application: Payroll
 * @author jconnolly
 *
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exercise2_11A {
	
	public static void main(String[] args) {		
		String nameString = JOptionPane.showInputDialog("Enter employee's name:");
		String name = nameString;
		String hoursWorkedString = JOptionPane.showInputDialog("Enter number of hours worked in a week:");
		double hoursWorked = Double.parseDouble(hoursWorkedString);
		String payRateString = JOptionPane.showInputDialog("Enter hourly pay rate:");
		double payRate = Double.parseDouble(payRateString);
		String fedTaxRateString = JOptionPane.showInputDialog("Enter federal tax witholding rate:");
		double fedTaxRate = Double.parseDouble(fedTaxRateString);
		String stateTaxRateString = JOptionPane.showInputDialog("Enter state tax witholding rate:");
		double stateTaxRate = Double.parseDouble(stateTaxRateString);
		
		double grossPay = hoursWorked * payRate;
		double fedTaxes = (grossPay / 100) * fedTaxRate;
		double stateTaxes = (grossPay / 100) * stateTaxRate;
		double totalDeduction = fedTaxes + stateTaxes;
		double netPay = grossPay - totalDeduction;
		
		String output = "Employee Name: " + name + "\nHours Worked: " + hoursWorked
				+ "\nPay Rate: " + "$" + payRate + "\nGross Pay: " + "$" + grossPay + "\nDeductions:"
				+ "\n" + "\t" + "Federal Witholding (20.0%): " + "$" + fedTaxes
				+ "\n" + "\t" + "State Witholding (9.0%): " + "$" + stateTaxes
				+ "\n" + "\t" + "Total Deductions: " + "$" + totalDeduction
				+ "\nNet Pay: " + "$" + netPay;
		JOptionPane.showMessageDialog(null, new JTextArea(output));
	}

}
