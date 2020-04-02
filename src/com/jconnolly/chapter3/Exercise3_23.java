package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Geometry: Point in a triangle.
 * @author jconnolly
 *
 */

public class Exercise3_23 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates x and y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Rectangle whose center point is (0,0)
		double width = 10;
		double height = 5;
		
		if(x <= width / 2 && y <= height / 2) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}

	}

}
