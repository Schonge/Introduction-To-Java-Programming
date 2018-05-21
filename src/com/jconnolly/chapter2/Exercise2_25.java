package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Current time.
 * @author jconnolly
 *
 */

public class Exercise2_25 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		currentHour += offset;
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute 
				+ ":" + currentSecond);
	}

}
