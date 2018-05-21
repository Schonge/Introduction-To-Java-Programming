package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Game: Learning addition.
 * @author jconnolly
 *
 */

public class Exercise3_04 {
	
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 100);
		int number2 = (int)((System.currentTimeMillis() * 7) % 100);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		if(number1 + number2 == answer) {
			System.out.println(number1 + " + " + number2 + " = " + answer + " is "
					+ (number1 + number2 == answer));
		} else {
			System.out.println(number1 + " + " + number2 + " = " + answer + " is "
					+ (number1 + number2 == answer));
		}
	}

}
