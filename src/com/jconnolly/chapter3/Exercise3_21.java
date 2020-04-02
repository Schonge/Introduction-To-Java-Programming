package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Science: Day of the week.
 * @author jconnolly
 *
 */

public class Exercise3_21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g. 2008): ");
		int year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month (1-31): ");
		int date = input.nextInt();
		
		/*
		 * Zellers Congruence for calculating the day of the week
		 * 
		 * h is the day using 0-6 as to represent Sat to Fri
		 * q is the day of the month(date)
		 * m is the month (3-March to 12-December) Jan and Feb are 13 and 14 of previous year
		 * j is the century (year / 100)
		 * k is the year of the century (i.e year % 7)
		 */
		
		int q, m = 0, j, k = 0;
		double h;
		
		if(month == 1) {
			m = 13;
			k = year--;
		} else if(month == 2) {
			m = 14;
			k = year--;
		} else {
			m = month;
		}
		
		k = year % 100;
		q = date;
		j = year / 100;
		
		System.out.println(k);
		System.out.println(q);
		System.out.println(j);
		System.out.println(m);
		
		// Zellers Congruence
		h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) + (int)(j / 4.0) + (int)(5 * j)) % 7;
		System.out.println(h);
		int answer = (int)h;
		
		if(answer == 0) {
			System.out.println("Day of the week is Saturday");
		} else if(answer == 1) {
			System.out.println("Day of the week is Sunday");
		} else if(answer == 2) {
			System.out.println("Day of the week is Monday");
		} else if(answer == 3) {
			System.out.println("Day of the week is Tuesday");
		} else if(answer == 4) {
			System.out.println("Day of the week is Wednesday");
		} else if(answer == 5) {
			System.out.println("Day of the week is Thursday");
		} else if(answer == 6) {
			System.out.println("Day of the week is Friday");
		}

	}

}
