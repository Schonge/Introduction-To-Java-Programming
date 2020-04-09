package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Financial Application: Comparing loans with various interest rates.
 * @author jconnolly
 *
 */

public class Exercise4_21 {

	public static void main(String[] args) {
		final double MIN_INTEREST_RATE = 5.0;
		final double MAX_INTEREST_RATE = 8.0;
		final double INCREMENTS = 1.0 / 8;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate			Monthly Payment				Total Payment");
		for(double yearlyRate = MIN_INTEREST_RATE; yearlyRate <= MAX_INTEREST_RATE; yearlyRate += INCREMENTS) {
			double monthlyRate = yearlyRate / 1200;
			
			double monthlyPayment = (amount * monthlyRate) / (1.0 - 1.0 / Math.pow((1.0 + monthlyRate), (years * 12)));
			double totalPayment = monthlyPayment * years * 12;
			
			System.out.println(yearlyRate + "%			" + (int)(monthlyPayment * 100) / 100.0 + "			" + (int)(totalPayment * 100) / 100.0);
			
		}

	}

}
