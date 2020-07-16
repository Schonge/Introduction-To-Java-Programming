package com.jconnolly.chapter5;

/**
 * Using the Math.sqrt method.
 * @author jconnolly
 *
 */

public class Exercise5_18 {

	public static void main(String[] args) {
		
		final int MIN_NUMBER = 0;
		final int MAX_NUMBER = 20;
		final int NUMBER_CHANGE = 2;
		
		System.out.println("Number\t\tSquareRoot");
		for(int number = MIN_NUMBER; number <= MAX_NUMBER; number += NUMBER_CHANGE) {
			System.out.printf("%-2d\t\t%-7.4f\n", number, getSqrRoot(number));
		}
		
	}
	
	public static double getSqrRoot(int number) {
		return Math.sqrt(number);
	}

}
