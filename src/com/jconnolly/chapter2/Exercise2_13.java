package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Calculating the future investment value.
 * @author jconnolly
 *
 */

public class Exercise2_13 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter monthly interest rate: ");
		double monthlyInterestRate = input.nextDouble() / 1200;
		System.out.print("Enter number of years: ");
		double years = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		
		System.out.println("Accumulated value is " + futureInvestmentValue );
	}
}
