package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Repeating additions.
 * @author jconnolly
 *
 */

public class Exercise4_02 {

	public static void main(String[] args) {
		// Number of questions
		final int NUMBER_OF_QUESTIONS = 10;
		// Count the number of correct answers
		int correctCount = 0;
		// Count the number of questions
		int count = 0;
		long startTime = System.currentTimeMillis();
		// Output String is initially empty;
		String output = "";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while(count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random integers between 1 and 15
			int number1 = 1 + (int)(Math.random() * 15);
			int number2 = 1 + (int)(Math.random() * 15);
			
			// 2. If number1 < number2, swap number1 with number2
			if(number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			// 3. Prompt the student to answer "What is number1 = number2?"
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			
			// 4. Grade the answer and display the result
			if(number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else {
				System.out.println("You are incorrect!\n"
						+ number1 + " - " + number2 + " should be " + (number1 - number2));
			}
			
			// Increase the count
			count++;
			
			output += "\n" + number1 + " - " + number2 + " = " + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount
				+ "\nTest time is " + (testTime / 1000) + " seconds\n" + output);

	}

}
