package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Checking whether a number is odd.
 * @author jconnolly
 *
 */

public class Exercise3_02 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number= input.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Is " + number + " an odd number? False");
		} else {
			System.out.println("Is " + number + " an odd number? True");
		}
	}

}
