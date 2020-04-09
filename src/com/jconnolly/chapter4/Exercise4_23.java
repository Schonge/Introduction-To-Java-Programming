package com.jconnolly.chapter4;

/**
 * Obtaining more accurate results.
 * @author jconnolly
 *
 */

public class Exercise4_23 {

	public static void main(String[] args) {
		final int N = 50000;
		double resultLtR = 1.0, resultRtL = 1.0 / N;
		
		
		// Compute Left to Right
		for(int i = 2; i <= N; i++) {
			resultLtR += 1.0 / i;
		}
		System.out.println("The result from Left to Right is " + resultLtR);
		
		// Compute Right to Left
		for(int i = N; i > 0; i--) {
			resultRtL += 1.0 / i;
		}
		System.out.println("The result from Right to Left is " + resultRtL);

	}

}
