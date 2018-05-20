package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Payroll
 * @author jconnolly
 *
 */

public class Exercise2_11B {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		double fedTaxRate = input.nextDouble();
		System.out.print("Enter state tax witholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = hoursWorked * payRate;
		double fedTaxes = (grossPay / 100) * fedTaxRate;
		double stateTaxes = (grossPay / 100) * stateTaxRate;
		double totalDeduction = fedTaxes + stateTaxes;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("\t" + "Federal Witholding (20.0%): " + fedTaxes);
		System.out.println("\t" + "State Witholding (9.0%): " + stateTaxes);
		System.out.println("\t" + "Total Deductions: " + totalDeduction);
		System.out.println("Net Pay: " + netPay);
	}

}
