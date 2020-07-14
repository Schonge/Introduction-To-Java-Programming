package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Displaying characters.
 * @author jconnolly
 *
 */

public class Exercise5_12 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a lowercase letter: ");
		char lowercase = input.next().charAt(0);
		
		if(Character.isUpperCase(lowercase)) {
			System.out.println("Invalid input!");
		} else {
			printUppercase(lowercase);
		}
		
		
	}
	
	public static void printUppercase(char lowercase) {
		System.out.println("The letter " + lowercase + " in uppercase is " + Character.toUpperCase(lowercase));
	}

}
