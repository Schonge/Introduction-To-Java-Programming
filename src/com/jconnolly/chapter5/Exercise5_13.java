package com.jconnolly.chapter5;

/**
 * Summing series.
 * @author jconnolly
 *
 */

public class Exercise5_13 {

	public static void main(String[] args) {
		
		final int MIN_I = 1;
		final int MAX_I = 20;
		
		System.out.println("i\t\tm(i)");
		
		for(int i = MIN_I; i <= MAX_I; i++) {			
			System.out.printf("%-2d\t\t%-7.4f\n", i, sumSeries(i));
		}
		
	}
	
	public static double sumSeries(int i) {
		double sum = 0.0;
		for(int j = 1; j <= i; j++) {
			sum += j / (j + 1.0);
		}
		return sum;
	}

}
