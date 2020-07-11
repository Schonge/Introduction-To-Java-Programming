package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Palindrome integer.
 * @author jconnolly
 *
 */

public class Exercise5_03 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print(number + " is ");
		if(!isPalindrom(number)) {
			System.out.print("not ");
		}
		System.out.println("a palindrome");
		

	}
	
	public static int reverse(int number) {
		
		if(number <= 0) {
			return 0;
		}
		
		String reverseNumString = "";
		while(number > 0) {
			reverseNumString += number % 10;
			number = number / 10;
		}
		return Integer.parseInt(reverseNumString);		
	}

	public static boolean isPalindrom(int number) {
		return number == reverse(number);
	}
}
