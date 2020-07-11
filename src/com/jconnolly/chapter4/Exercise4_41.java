package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Occurrences of a min number.
 * @author jconnolly
 *
 */

public class Exercise4_41 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int number = input.nextInt();
		
		int min = number;
		int count = 1;
		
		do {
			number = input.nextInt();
			
			if(number == min) {
				count++;
			} else if(number < min && number != 0) {
				min = number;
				count = 1;
			}
		} while(number != 0);
		
		System.out.println("The smallest number is " + min);
		System.out.println("The occurrence count of the smallest number is " + count);
		
	}

}
