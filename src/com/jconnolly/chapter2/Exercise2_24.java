package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Physics: Finding runway length.
 * @author jconnolly
 *
 */

public class Exercise2_24 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = Math.pow(v, 2) / (2 * a);
		
		System.out.print("The minumum runway length for this airplane is " + length);
	}

}
