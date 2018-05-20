package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Finding the character of an ASCII code.
 * @author jconnolly
 *
 */

public class Exercise2_08 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int ascii = input.nextInt();
		
		System.out.println("The value in inches is " + (char)ascii);
	}

}
