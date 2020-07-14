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
		double monthlyInterestRate = yearlyInterestRate / 1200;
		System.out.println("The amount invested is: $" + amount);
		System.out.println("Annual interest rate: " + yearlyInterestRate + "%");
		System.out.println("Years\tFuture Value");
		
		for(int year = 1; year <= YEARS; year++) {
			System.out.printf("%5d\t%12.2f", year, futureInvestmentValue(amount, monthlyInterestRate, year));
			System.out.println();
		}
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return (int)(investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12)) * 100) / 100.0;
	}

}
