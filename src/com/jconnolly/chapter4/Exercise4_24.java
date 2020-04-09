package com.jconnolly.chapter4;

/**
 * Summing a series.
 * @author jconnolly
 *
 */

public class Exercise4_24 {

	public static void main(String[] args) {
		double result = 0.0;
		double numerator = 1.0, denominator = 2.0;
		for(int i = 1; i <= 98; i += 2) {
			result += numerator / denominator;
			numerator += i;
			denominator += i;
		}
		
		System.out.println("The sum of the series is " + result);		

	}

}
