package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Finding the number of hours.
 * @author jconnolly
 *
 */

public class Exercise2_26 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		int totalSeconds = seconds % 60;
		int totalMinutes = (seconds / 60) % 60;
		int totalHours = (seconds / 60) / 60;
		
		System.out.println(seconds + " seconds is " + totalHours + " hours, " + totalMinutes
				+ " minutes, and " + totalSeconds + " seconds." );
	}

}
