package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * The MyTriangle class.
 * @author jconnolly
 *
 */

public class Exercise5_19 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if(isValid(side1, side2, side3)) {
			System.out.printf("The area of the triangle is %.2f", area(side1, side2, side3));
		} else {
			System.out.println("Input is invalid!");
		}		
		
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);
		area = Math.sqrt(area);
		return area;
	}

}
