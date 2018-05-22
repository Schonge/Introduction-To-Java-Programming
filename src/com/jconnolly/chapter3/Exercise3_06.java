package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Health Application: BMI.
 * @author jconnolly
 *
 */

public class Exercise3_06 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in feet and inches: ");
		double feet = input.nextDouble();
		double inches = input.nextDouble();
		
		double height = (feet * 12) + inches;
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilos = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilos / (heightInMeters * heightInMeters);
		
		System.out.println("Your BMI is " + bmi);
		if(bmi < 16) {
			System.out.println("You are seriously underweight");
		} else if(bmi < 18) {
			System.out.println("You are underweight");
		} else if(bmi < 24) {
			System.out.println("You are normal weight");
		} else if(bmi < 29) {
			System.out.println("You are overweight");
		} else if(bmi < 35) {
			System.out.println("You are seriously overweight");
		} else {
			System.out.println("You are gravely overweight");
		}
	}

}
