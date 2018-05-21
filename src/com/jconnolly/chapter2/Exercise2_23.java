package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Physics: Acceleration.
 * @author jconnolly
 *
 */

public class Exercise2_23 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acceleration = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + acceleration);
	}

}
