package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Displaying the last day of each month.
 * @author jconnolly
 *
 */

public class Exercise4_28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter the first day of the year " + year + " (0 = Sunday, 1 = Monday, 2 = Tuesday etc.): ");
		int day = input.nextInt();
		
		int date = 0;
		// Adding on full months worth of days will give an extra day. Remove extra day here.
		day = day - 1;
		for (int month = 1; month <= 12; month++)
		{
			switch (month) {
				case 1:
					System.out.print("January");
					date = 31;
					day += date;
					break;
				case 2:
					System.out.print("February");
					boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
					if (isLeapYear)	{
						date = 29;
						day += date;
					} else {
						date = 28;
					}
					break;
				case 3:
					System.out.print("March");
					date = 31;
					day += date;
					break;
				case 4:
					System.out.print("April");
					date = 30;
					day += date;
					break;
				case 5:
					System.out.print("May");
					date = 31;
					day += date;
					break;
				case 6:
					System.out.print("June");
					date = 30;
					day += date;
					break;
				case 7:
					System.out.print("July");
					date = 31;
					day += date;
					break;
				case 8:
					System.out.print("August");
					date = 31;
					day += date;
					break;
				case 9:
					System.out.print("September");
					date = 30;
					day += date;
					break;
				case 10:
					System.out.print("October");
					date = 31;
					day += date;
					break;
				case 11:
					System.out.print("November");
					date = 30;
					day += date;
					break;
				case 12:
					System.out.print("December");
					date = 31;
					day += date;
					break;
			}

			switch (day % 7) {
				case 0:
					System.out.println(" " + date + ", " + year + " is Sunday");
					break;
				case 1:
					System.out.println(" " + date + ", " + year + " is Monday");
					break;
				case 2:
					System.out.println(" " + date + ", " + year + " is Tuesday");
					break;
				case 3:
					System.out.println(" " + date + ", " + year + " is Wednesday");
					break;
				case 4:
					System.out.println(" " + date + ", " + year + " is Thursday");
					break;
				case 5:
					System.out.println(" " + date + ", " + year + " is Friday");
					break;
				case 6:
					System.out.println(" " + date + ", " + year + " is Saturday");
					break;
			}
			
		}
	}

}
