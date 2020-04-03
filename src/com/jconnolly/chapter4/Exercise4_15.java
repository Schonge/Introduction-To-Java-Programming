package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Computing the greatest common divisor.
 * @author jconnolly
 *
 */

public class Exercise4_15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int d = 1;	
		if(n1 < n2)	{
			d = n1;
		} else {
			d = n2;
		}
		
		while((d > 1) && ((n1 % d != 0) || (n2 % d != 0))) {
			--d;
		}
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);

	}

}
