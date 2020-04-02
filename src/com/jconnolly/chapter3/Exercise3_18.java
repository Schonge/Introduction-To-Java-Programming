package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/**
 * Using the input dialog box.
 * @author jconnolly
 *
 */

public class Exercise3_18 {

	public static void main(String[] args) {
		// Create an input dialog box
		String yearString = JOptionPane.showInputDialog("Enter a year: ");
		int year = Integer.parseInt(yearString);
		
		// Check if the year is a leap year
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0));
		
		// Display the result
		String output = year + " is a leap year? " + isLeapYear;
		JOptionPane.showMessageDialog(null, output);
		
	}

}
