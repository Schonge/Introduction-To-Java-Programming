package com.jconnolly.chapter5;

/**
 * Computing a series.
 * @author jconnolly
 *
 */

public class Exercise5_14 {

	public static void main(String[] args) {
		
		final int MIN_I = 5;
		final int MAX_I = 50;
		final int I_CHANGE = 5;
		
		System.out.println("i\t\tm(i)");
		
		for(int i = MIN_I; i <= MAX_I; i+= I_CHANGE) {			
			System.out.printf("%-2d\t\t%-7.5f\n", i, computeSeries(i));
		}
		
	}
	
	public static double computeSeries(int i) {
		double sum = 0.0;
		for(int j = 1; j <= i; j++) {
			sum += Math.pow(-1, j + 1) / j;
		}
		return sum;
	}

}
