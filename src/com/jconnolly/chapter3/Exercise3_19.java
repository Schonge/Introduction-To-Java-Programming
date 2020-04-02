package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Classifying triangles.
 * @author jconnolly
 *
 */

public class Exercise3_19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides (doubles): ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)) {
			System.out.println("Input is invalid!");
		} else if(side1 == side2 && side2 == side3) {
			System.out.println("Those sides are from an equilateral triangle");
		} else if((side1 == side2 && side1 != side3) || (side1 == side3 && side1 != side2)
				|| (side2 == side3 && side2 != side1)) {
			System.out.println("Those sides are from an isosceles triangle");
		} else {
			System.out.println("Those sides are from a scalene triangle");
		}

	}

}
