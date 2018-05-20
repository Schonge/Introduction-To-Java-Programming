package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Financial Application: Calculating tips.
 * @author jconnolly
 *
 */

public class Exercise2_05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratRate = input.nextDouble();
		
		double gratuity = (subtotal / 100) * gratRate;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}
	
}
