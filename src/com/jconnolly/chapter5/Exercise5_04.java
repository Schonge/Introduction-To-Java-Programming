package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Displaying an integer reversed.
 * @author jconnolly
 *
 */

public class Exercise5_04 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if(number <= 9) {
			System.out.println("Please provide a number greater than 9 that can be reversed!");
		} else {
			System.out.print(number + " reversed is ");
			reverse(number);
		}
		
	}
	
	public static void reverse(int number) {
		
		String reverseNumString = "";
		while(number > 0) {
			reverseNumString += number % 10;
			number = number / 10;
		}
		System.out.println(reverseNumString);
	}

}
