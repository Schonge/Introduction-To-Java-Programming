package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Multiplying the digits in an integer.
 * @author jconnolly
 *
 */

public class Exercise2_06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer between 100 and 999: ");
		int number = input.nextInt();
		
		int digit1, digit2, digit3;
		digit1 = number % 10;
		digit2 = (number / 10) % 10;
		digit3 = number / 100;
		
		int product = digit1 * digit2 * digit3;
		System.out.println("The product of the digits is " + product);
	}
	
}
