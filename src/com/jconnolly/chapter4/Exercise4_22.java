package com.jconnolly.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Financial Application: Loan amortization schedule.
 * @author jconnolly
 *
 */

public class Exercise4_22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Interest Rate: ");
		double yearlyRate = input.nextDouble();
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		double monthlyRate = yearlyRate / 1200;
		
		double monthlyPayment = (amount * monthlyRate) / (1.0 - 1.0 / Math.pow((1.0 + monthlyRate), (years * 12)));
		double totalPayment = monthlyPayment * years * 12;
		
		System.out.println("Monthly Payment: " + df.format(monthlyPayment) + "\n" + "Total Payment: " + df.format(totalPayment));
		
		double interest = 0.0, principal = 0.0, balance = amount;
		
		System.out.println("Payment#			Interest			Principal			Balance");
		for(int month = 1; month <= years * 12; month++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.println(month + "			" + df.format(interest) + "			" + df.format(principal) + "			" + df.format(balance));
		}

	}

}
