package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Finding the number of days in a month.
 * @author jconnolly
 *
 */

public class Exercise3_11 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a month as an integer: ");
		int month = input.nextInt();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		int days = 0;
		String monthString = "";
		
		if(month > 12 || month < 1) {
			System.out.println(month + " is not a valid month");
		} else {
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				days = 30;
			} else if(month == 2 && (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
				days = 29;
			} else if(month ==2) {
				days = 28;
			} else {
				days = 31;
			}
		}
		
		switch(month) {
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			case 5: monthString = "May";
				break;
			case 6: monthString = "June";
				break;
			case 7: monthString = "July";
				break;
			case 8: monthString = "August";
				break;
			case 9: monthString = "September";
				break;
			case 10: monthString = "October";
				break;
			case 11: monthString = "November";
				break;
			case 12: monthString = "December";
				break;
		}
		
		System.out.println(monthString + " " + year + " has " + days + " days");
	}

}
