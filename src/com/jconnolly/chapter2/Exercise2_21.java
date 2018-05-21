package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Geometry: Area of a triangle.
 * @author jconnolly
 *
 */

public class Exercise2_21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		side1 = Math.sqrt(side1);
		double side2 = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);
		side2 = Math.sqrt(side2);
		double side3 = Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2);
		side3 = Math.sqrt(side3);
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);
		area = Math.sqrt(area);
		
		System.out.println("The area of a triangle is " + area);
	}
	
}
