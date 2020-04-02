package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Checking a number.
 * @author jconnolly
 *
 */

public class Exercise3_12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if(number % 3 == 0 && number % 4 == 0) {
			System.out.println(number + " is divisible by both 3 and 4.");
		} else if((number % 3 == 0 && number % 4 != 0) || (number % 3 != 0 && number % 4 == 0)) {
			System.out.println(number + " is divisible by 3 or 4, but not both.");
		} else {
			System.out.println(number + " is not divisible by either 3 or 4.");
		}

	}

}
