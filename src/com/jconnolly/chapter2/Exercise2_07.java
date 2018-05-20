package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Converting a lowercase letter to uppercase.
 * @author jconnolly
 *
 */

public class Exercise2_07 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("The lowercase letter is ");
		String lower = input.next();
		
		String upper = lower.toUpperCase();
		System.out.println("The uppercase letter is " + upper);
	}

}
