package com.jconnolly.chapter5;

/**
 * Displaying matrix of 0s and 1s.
 * @author jconnolly
 *
 */

public class Exercise5_17 {

	public static void main(String[] args) {
		
		int n = 3;
		printMatrix(n);		
		
	}
	
	public static void printMatrix(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print((int)(Math.random() * 2) + " "); // Generate random 0 or 1
			}
			System.out.println();
		}
	}

}
