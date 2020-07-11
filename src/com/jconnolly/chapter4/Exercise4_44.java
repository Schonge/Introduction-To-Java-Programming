package com.jconnolly.chapter4;

/**
 * Monte Carlo simulation.
 * @author jconnolly
 *
 */

public class Exercise4_44 {

	public static void main(String[] args) {
		
		final int NUMBER_OF_TRIALS = 1000000;
		int oddRegionHits = 0;
		
		double x = 0;
		double y = 0;
		
		// Center of square is (0,0)
		for(int i = 0; i < NUMBER_OF_TRIALS; i++) {
			x = (Math.random() * 2.0) - 1;
			y = (Math.random() * 2.0) - 1;
			if(x < 0) {
				oddRegionHits++;
			} else if(x >= 0 && x < 1 && y >= 0 && y < 1) {
				// If x and y are both +ive get the slope of the hypotenuse of the right-triangle
				// Check if x1 is in that area
				double slope = (1.0 - 0) / (0 - 1.0);
				double x1 = x + (-y * slope);
				if(x1 <= 1) {
					oddRegionHits++;
				}
			}
		}
		
		System.out.println("The probability of darts hitting region 1 and 3 are " +
				(1.0 * oddRegionHits / NUMBER_OF_TRIALS) + "%");
		
	}

}
