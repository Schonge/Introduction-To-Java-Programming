package com.jconnolly.chapter4;

/**
 * Finding the smallest n such that n^2 > 15000.
 * @author jconnolly
 *
 */

public class Exercise4_12 {

	public static void main(String[] args) {
		
		int n = 0, smallestN = 0;
		while(Math.pow(n, 2) <= 15000) {
			smallestN = n;
			n++;
		}
		smallestN++;
		System.out.println("Smallest n is " + smallestN);

	}

}
