package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Converting centimeters into inches.
 * @author jconnolly
 *
 */

public class Exercise2_03 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter centimeters as an integer: ");
		int cm = input.nextInt();
		
		double inches = cm * 0.3937;
		System.out.println("The value in inches is " + inches);
	}

}
