package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Algebra: Solving quadratic equations.
 * @author jconnolly
 *
 */

public class Exercise3_01 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double root1 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
		double root2 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
		double descriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(descriminant > 0) {
			System.out.println("The roots are " + root1 + " and " + root2);
		} else if(descriminant == 0) {
			System.out.println("The root is " + root1);
		} else {
			System.out.println("The equation has no real roots");
		}
	}

}
