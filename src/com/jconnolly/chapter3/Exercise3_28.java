package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Geometry: Two rectangles.
 * @author jconnolly
 *
 */

public class Exercise3_28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter R1's center (x, y) point, width and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter R2's center (x, y) point, width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double xDistance = 0, yDistance = 0;
		if(x1 >= x2) {
			xDistance = x1 - x2;
		} else {
			xDistance = x2 - x1;
		}
		if(y1 >= y2) {
			yDistance = y1 - y2;
		} else {
			yDistance = y2 - y1;
		}
		
		if(xDistance <= (width1 - width2) / 2 && yDistance <= (height1 - height2) / 2) {
			System.out.println("r2 is inside r1");
		} else if (xDistance <= (width1 + width2) / 2 && yDistance <= (height1 + height2) / 2) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}

	}

}
