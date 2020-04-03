package com.jconnolly.chapter4;

/**
 * Finding the largest n such that n^3 < 15000.
 * @author jconnolly
 *
 */

public class Exercise4_13 {

	public static void main(String[] args) {
		
		int n = 0, largestN = 0;
		while(Math.pow(n, 3) < 15000) {
			largestN = n;
			n++;
		}
		System.out.println("Largest n is " + largestN);

	}

}
