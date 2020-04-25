package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Displaying calendars.
 * @author jconnolly
 *
 */

public class Exercise4_29 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter the first day of the year " + year + " (0 = Sunday, 1 = Monday, 2 = Tuesday etc.): ");
		int day = input.nextInt();
		
		int numOfDays = 0;
		for (int month = 1; month <= 12; month++)
		{
			switch (month) {
				case 1:
					System.out.print("		" + "January");
					numOfDays = 31;
					break;
				case 2:
					System.out.print("		" + "February");
					boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
					if (isLeapYear)	{
						numOfDays = 29;
					} else {
						numOfDays = 28;
					}
					break;
				case 3:
					System.out.print("		" + "March");
					numOfDays = 31;
					break;
				case 4:
					System.out.print("		" + "April");
					numOfDays = 30;
					break;
				case 5:
					System.out.print("		" + "May");
					numOfDays = 31;
					break;
				case 6:
					System.out.print("		" + "June");
					numOfDays = 30;
					break;
				case 7:
					System.out.print("		" + "July");
					numOfDays = 31;
					break;
				case 8:
					System.out.print("		" + "August");
					numOfDays = 31;
					break;
				case 9:
					System.out.print("		" + "September");
					numOfDays = 30;
					break;
				case 10:
					System.out.print("		" + "October");
					numOfDays = 31;
					break;
				case 11:
					System.out.print("		" + "November");
					numOfDays = 30;
					break;
				case 12:
					System.out.print("		" + "December");
					numOfDays = 31;
					break;
			}
			
			System.out.println(" " + year);
			System.out.println("________________________________________");
			System.out.println("Sun\tMon\tTues\tWed\tThu\tFri\tSat");
			
			int count = (day % 7);
			
			for (int spaces = 0; spaces < count; spaces++)
			{
				System.out.print("\t");
			}
			
			for (int date = 1; date <= numOfDays; date++)
			{
				if ((count % 7 == 0) && (date > 1))
				{
					System.out.print("\n" + date + "\t");
				}
				else
				{
					System.out.print(date + "\t");
				}				
				count++;
			}
			System.out.println("\n");
			day += numOfDays;
		}
	}

}
