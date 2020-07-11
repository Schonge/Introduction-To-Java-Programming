package com.jconnolly.chapter5;

/**
 * Math: Triangular numbers.
 * @author jconnolly
 *
 */

public class Exercise5_01 {

	public static void main(String[] args) {
		
		printTriangularNumbers(100, 10);
		
	}
	
	public static int getTriangularNumber(int n) {
		return (n * (n + 1)) / 2;
	}
	
	public static void printTriangularNumbers(int numOfTriNumbers, int maxNumOnLine) {
		
		if(maxNumOnLine < 1) {
			maxNumOnLine = 1;
		}
		
		for(int n = 1; n <= numOfTriNumbers; n++) {
			System.out.print(getTriangularNumber(n));
			if(n % maxNumOnLine == 0 || n == numOfTriNumbers) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
		
	}

}
