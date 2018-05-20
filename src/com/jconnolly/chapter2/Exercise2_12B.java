package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Calculating interest.
 * @author jconnolly
 *
 */

public class Exercise2_12B {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance: ");
		double balance = input.nextDouble();
		System.out.print("Enter annual interest rate (e.g. 5.2 for 5.2%): ");
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		double newBalance = balance + interest;
		
		System.out.println("The interest is " + interest + " and the new balance is " + newBalance);
	}
	
}
