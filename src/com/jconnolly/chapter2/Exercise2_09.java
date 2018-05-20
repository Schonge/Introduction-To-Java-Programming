package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Monetary units.
 * @author jconnolly
 *
 */

public class Exercise2_09 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount as an integer e.g. 11.56 as 1156: ");
		int amount = input.nextInt();
		
		int numberOfOneDollars = amount / 100;
		int remainingAmount = amount % 100;
		
		System.out.println("Your amount " + amount + " consists of " + numberOfOneDollars
				+ " dollars and " + remainingAmount + " cents");
	}

}
