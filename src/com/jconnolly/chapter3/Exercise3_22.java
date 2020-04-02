package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Geometry: Point in a circle.
 * @author jconnolly
 *
 */

public class Exercise3_22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point(x, y): ");
		double x = input.nextInt();
		double y = input.nextInt();
		
		double centerX = 0;
		double centerY = 0;
		double radius = 10;
		
		double distance = Math.sqrt(Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2));
		
		if(distance > radius) {
			System.out.println("Point (" + x + ", " + y + ") is not in circle");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		}

	}

}
