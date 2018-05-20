package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Converting pounds to kilograms.
 * @author jconnolly
 *
 */

public class Exercise2_04 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double lbs = input.nextDouble();
		
		double kgs = lbs * 0.454;
		System.out.println(lbs + " pounds is " + kgs + " kilograms");
	}

}
