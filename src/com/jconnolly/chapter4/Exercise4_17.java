package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Displaying pyramid.
 * @author jconnolly
 *
 */

public class Exercise4_17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		int numOfLines = 0;
		while(numOfLines < 1 || numOfLines > 15) {
			System.out.print("Enter the number of lines: ");
			numOfLines = input.nextInt();
		}
		
		for(int line = 1; line <= numOfLines; line++) {
			for(int space = line; space < numOfLines; space++) {
				if(space > 8) {
					System.out.print("   ");
				} else {
					System.out.print("  ");
				}
			}
			
			for(int column = -line; column <= line; column++) {
				if(column != -1 && column != 0) {
					if(column < 0) {
						System.out.print(-column + " ");
					} else {
						System.out.print(column + " ");
					}
				}
			}
			System.out.println();
		}
		
		

	}

}
