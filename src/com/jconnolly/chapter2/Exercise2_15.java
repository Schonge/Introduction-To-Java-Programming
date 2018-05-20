package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Compound value.
 * @author jconnolly
 *
 */

public class Exercise2_15 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter savings amount: ");
		double savings = input.nextDouble();
		System.out.print("Enter monthly interest rate: ");
		double monthlyInterestRate = input.nextDouble() / 1200;
		
		double month1 = savings * (1 + monthlyInterestRate);
		double month2 = (savings + month1) * (1 + monthlyInterestRate);
		double month3 = (savings + month2) * (1 + monthlyInterestRate);
		double month4 = (savings + month3) * (1 + monthlyInterestRate);
		double month5 = (savings + month4) * (1 + monthlyInterestRate);
		double month6 = (savings + month5) * (1 + monthlyInterestRate);
		
		System.out.println("The account value after 6 months is " + month6);
	}

}
