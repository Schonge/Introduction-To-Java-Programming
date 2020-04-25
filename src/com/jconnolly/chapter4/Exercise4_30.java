package com.jconnolly.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Financial Application: Compound value.
 * @author jconnolly
 *
 */

public class Exercise4_30 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate (e.g. 5 for 5%): ");
		double annualIntRate = input.nextDouble();
		System.out.print("Enter the number of months: ");
		int months = input.nextInt();
		
		double totalAmount = 0;
		double monthlyIntRate = annualIntRate / 1200;
		for(int i = 1; i <= months; i++) {
			totalAmount = (amount + totalAmount) * (1 + monthlyIntRate);
			
			System.out.print("After " + i);
			if(i == 1) {
				System.out.print(" month");
			} else {
				System.out.print(" months");
			}
			DecimalFormat df = new DecimalFormat("###.###");
			System.out.println(", the amount in your savings account is: " + df.format(totalAmount));
		}
		
	}

}
