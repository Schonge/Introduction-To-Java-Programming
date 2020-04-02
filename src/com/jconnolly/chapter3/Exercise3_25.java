package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Converting from military time.
 * @author jconnolly
 *
 */

public class Exercise3_25 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hour: ");
		int hour = input.nextInt();
		System.out.print("Enter minute: ");
		int minute = input.nextInt();
		
		int standardHour = 0;
		
		
		if((hour < 0 || hour > 24) || (minute < 0 || minute > 60)) {
			System.out.println("Invalid input!");
		} else {
			if(hour > 12) {
				standardHour = hour - 12;
				System.out.println("The standard time is " + standardHour + ":"
						+ String.format("%02d", minute) + "pm");
			} else if(hour == 0) {
				standardHour += 12;
				System.out.println("The standard time is " + standardHour + ":"
						+ String.format("%02d", minute) + "am");
			} else {
				standardHour = hour;
				System.out.println("The standard time is " + standardHour + ":"
						+ String.format("%02d", minute) + "am");
			}
		}

	}

}
