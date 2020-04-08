package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Finding the factors of an integer.
 * @author jconnolly
 *
 */

public class Exercise4_16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		System.out.print("The factors for " + number + " are: ");
		for(int i = number; i > 0; i--) {
			if(number % i == 0 && i != 1) {
				System.out.print(i + ", ");
			}
			if(i == 1) {
				System.out.println("and " + i + ".");
			}
		}

	}

}
