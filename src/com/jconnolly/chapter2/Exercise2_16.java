package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Science: Calculating energy.
 * @author jconnolly
 *
 */

public class Exercise2_16 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterWeight = input.nextDouble();
		System.out.print("Enter the initial temperature(Celsius): ");
		double initialTemp = input.nextDouble();
		System.out.print("Enter the final temperature(Celsius): ");
		double finalTemp = input.nextDouble();
		
		double energy = waterWeight * (finalTemp - initialTemp) * 4184;
		
		System.out.println("The energy needed is " + energy);
	}

}
