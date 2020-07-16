package com.jconnolly.chapter5;

/**
 * Using trigonometric methods.
 * @author jconnolly
 *
 */

public class Exercise5_20 {

	public static void main(String[] args) {
		
		final int MIN_DEGREES = 0;
		final int MAX_DEGREES = 360;
		final int DEGREE_CHANGE = 10;
		
		System.out.println("Degree\t\tSin\t\tCos");
		
		for(int degrees = MIN_DEGREES; degrees <= MAX_DEGREES; degrees += DEGREE_CHANGE) {
			System.out.printf("%-2d\t\t%-7.4f\t\t%-7.4f\n", degrees, getSin(degrees), getCos(degrees));
		}
		
	}
	
	public static double getSin(int degrees) {
		return Math.round(Math.sin(degrees * Math.PI / 180.0) * 10000.0) / 10000.0;
	}
	
	public static double getCos(int degrees) {
		return Math.round(Math.cos(degrees * Math.PI / 180.0) * 10000.0) / 10000.0;
	}

}
