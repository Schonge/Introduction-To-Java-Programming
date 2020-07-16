package com.jconnolly.chapter5;

import java.util.Scanner;

/**
 * Number of days in a month.
 * @author jconnolly
 *
 */

public class Exercise5_16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int month = 0;
		while(month < 1 || month > 12) {
			System.out.print("Enter a month (January = 1): ");
			month = input.nextInt();
		}
		
		switch(month) {
			case 1:
				System.out.println("January has " + daysInMonth(month) + " days.");
				break;
			case 2:
				System.out.println("February has " + daysInMonth(month) + " days.");
				break;
			case 3:
				System.out.println("March has " + daysInMonth(month) + " days.");
				break;
			case 4:
				System.out.println("April has " + daysInMonth(month) + " days.");
				break;
			case 5:
				System.out.println("May has " + daysInMonth(month) + " days.");
				break;
			case 6:
				System.out.println("June has " + daysInMonth(month) + " days.");
				break;
			case 7:
				System.out.println("July has " + daysInMonth(month) + " days.");
				break;
			case 8:
				System.out.println("August has " + daysInMonth(month) + " days.");
				break;
			case 9:
				System.out.println("September has " + daysInMonth(month) + " days.");
				break;
			case 10:
				System.out.println("October has " + daysInMonth(month) + " days.");
				break;
			case 11:
				System.out.println("November has " + daysInMonth(month) + " days.");
				break;
			case 12:
				System.out.println("December has " + daysInMonth(month) + " days.");
				break;
		}
		
		
	}
	
	public static int daysInMonth(int month) {
		int days = 0;
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else if(month == 2) { // Ignoring leap years as per exercise instructions
			days = 28;
		} else {
			days = 31;
		}
		
		return days;
	}

}
