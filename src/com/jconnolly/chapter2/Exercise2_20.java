package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Geometry: Distance of two points.
 * @author jconnolly
 *
 */

public class Exercise2_20 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		distance = Math.sqrt(distance);
		
		System.out.println("The distance of the two points is " + distance);
	}

}
