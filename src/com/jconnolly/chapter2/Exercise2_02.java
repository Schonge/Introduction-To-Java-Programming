package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Computing the volume of a cylinder.
 * @author jconnolly
 *
 */

public class Exercise2_02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a Cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius  * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
	
}
