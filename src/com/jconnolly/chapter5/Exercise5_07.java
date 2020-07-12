package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Financial Application: Computing the future investment value.
 * @author jconnolly
 *
 */

public class Exercise5_07 {

	public static void main(String[] args) {
		
		final int YEARS = 30;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Please enter yearly interest rate: ");
		double yearlyInterestRate = input.nextDouble();
				
		
		while(amount < 1 || yearlyInterestRate <= 0) {
			System.out.print("Please enter an investment amount: ");
			amount = input.nextDouble();
			System.out.print("Please enter yearly interest rate: ");
			yearlyInterestRate = input.nextDouble();
		}
		double monthlyInterestRate = yearlyInterestRate / 12;
		futureInvestmentValue(amount, monthlyInterestRate, YEARS);
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double monies = 0;
		return monies;
	}

}
