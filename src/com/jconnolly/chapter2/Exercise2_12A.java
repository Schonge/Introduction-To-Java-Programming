package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/**
 * Financial Application: Calculating interest.
 * @author jconnolly
 *
 */

public class Exercise2_12A {
	
	public static void main(String[] args) {
		String balanceString = JOptionPane.showInputDialog("Enter balance:");
		double balance = Double.parseDouble(balanceString);
		String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate (e.g. 5.2 for 5.2%):");
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		double interest = balance * (annualInterestRate / 1200);
		double newBalance = balance + interest;
		
		String output = "The interest is " + interest + " and the new balance is " + newBalance;
		JOptionPane.showMessageDialog(null, output);
	}

}
