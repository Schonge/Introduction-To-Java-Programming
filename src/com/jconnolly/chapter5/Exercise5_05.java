package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Sorting three numbers.
 * @author jconnolly
 *
 */

public class Exercise5_05 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three numbers.");
		System.out.print("First number: ");
		double num1 = input.nextDouble();
		System.out.print("Second number: ");
		double num2 = input.nextDouble();
		System.out.print("Third number: ");
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
				
	}
	
	// NOTE: Order of If statements is important
	// If 2nd and 3rd If statements are swapped, numbers ar arranged incorrectly
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if(num1 < num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num1 < num3) {
			double temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2 < num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.print("Your numbers in decreasing order are " + num1 + " " + num2 + " " + num3);
	}

}
