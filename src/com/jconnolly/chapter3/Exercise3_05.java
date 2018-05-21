package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Game: Picking the lowest integer.
 * @author jconnolly
 *
 */

public class Exercise3_05 {
	
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 100);
		int number2 = (int)((System.currentTimeMillis() * 7) % 100);
		int number3 = (int)((System.currentTimeMillis() * 8) % 100);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which is the lowest integer? " + number1 + ", " + number2 + ", or " + number3 + "? ");
		int answer = input.nextInt();
		
		if(number1 <= number2 && number1 <= number3 && number1 == answer) {
			System.out.println("You are CORRECT!");
		} else if(number2 <= number1 && number2 <= number3 && number2 == answer) {
			System.out.println("You are CORRECT!");
		} else if(number3 <= number1 && number3 <= number2 && number3 == answer) {
			System.out.println("You are CORRECT!");
		} else {
			System.out.println("Sorry, You are INCORRECT!");
		}
	}

}
