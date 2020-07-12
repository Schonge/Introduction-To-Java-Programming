package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Displaying patterns.
 * @author jconnolly
 *
 */

public class Exercise5_06 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		while(n < 1) {
			System.out.print("Please enter an integer: ");
			n = input.nextInt();
		}
		
		displayPattern(n);
		
	}
	
	public static void displayPattern(int n) {
		for(int row = 1; row <= n; row++) {
			for(int space = row; space < n; space++) {
				System.out.printf("%4s", "");				
			}
			for(int i = row; i >= 1; i--) {
				System.out.printf("%4d", i);
			}
			System.out.println();
		}		
	}

}
