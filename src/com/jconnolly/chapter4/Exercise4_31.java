package com.jconnolly.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Financial Application: Computing CD value.
 * @author jconnolly
 *
 */

public class Exercise4_31 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual percentage yield (e.g. 5 for 5%): ");
		double annualYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();
		
		double monthlyYield = annualYield / 1200;
		System.out.println("Month			CD Value");	
		for(int i = 1; i <= months; i++) {
			amount = amount + (amount * monthlyYield);
			DecimalFormat df = new DecimalFormat("###.##");
			System.out.println(i+ "			" + df.format(amount));
		}
	}

}
