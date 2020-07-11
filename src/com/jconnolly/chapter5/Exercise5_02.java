package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Summing the digits in an integer.
 * @author jconnolly
 *
 */

public class Exercise5_02 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println("The sum of the provided number's digits is " + sumDigits(number));
		
	}
	
	public static int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

}
