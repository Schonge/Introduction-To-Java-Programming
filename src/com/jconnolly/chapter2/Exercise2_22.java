package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Geometry: Area of a regular octagon.
 * @author jconnolly
 *
 */

public class Exercise2_22 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of one side: ");
		double s = input.nextDouble();
		
		double area = 2 * (1 + Math.sqrt(2)) * Math.pow(s, 2);
		
		System.out.println("The area of the octagon is " + area);
	}

}
