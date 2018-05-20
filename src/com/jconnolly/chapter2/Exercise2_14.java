package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Health Application: Computing BMI.
 * @author jconnolly
 *
 */

public class Exercise2_14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		int height = input.nextInt();
		
		double weightKgs = weight * 0.45359237;
		double heightMeters = height * 0.0254;
		
		double bmi = weightKgs / Math.pow(heightMeters, 2);
		
		System.out.println("BMI is " + bmi);
	}
	
}
