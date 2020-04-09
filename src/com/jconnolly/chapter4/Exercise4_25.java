package com.jconnolly.chapter4;

/**
 * Computing Pi.
 * @author jconnolly
 *
 */

public class Exercise4_25 {

	public static void main(String[] args) {
		
		for(int i = 10000; i <= 100000; i += 10000) {
			double pi = 0.0;
			
			for(int j = 0; j < i; j++) {
				pi += Math.pow(-1, j) / ((2 * j) + 1);
			}
			
			pi *= 4;
			System.out.println("Where i is " + i + ", Pi is approximately " + pi);
		}

	}

}
