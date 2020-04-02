package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Geometry: Two circles.
 * @author jconnolly
 *
 */

public class Exercise3_29 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center (x, y) point, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter circle2's center (x, y) point, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		double distanceBetweenCenters = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		if(distanceBetweenCenters <= (radius1 - radius2)) {
			System.out.println("circle2 is inside circle1");
		} else if(distanceBetweenCenters <= (radius1 + radius2)) {
			System.out.println("circle2 overlaps circle1");
		} else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
