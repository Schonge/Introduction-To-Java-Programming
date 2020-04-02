package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Science: Wind-chill temperature.
 * @author jconnolly
 *
 */

public class Exercise3_20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Farenheit: ");
		double temp = input.nextDouble();
		System.out.print("Enter the wind speed in mph: ");
		double windSpeed = input.nextDouble();
		
		if((temp < -58 || temp > 41) && windSpeed < 2) {
			System.out.println("Both temperature and wind speed are invalid!");
		} else if(temp < -58 || temp > 41) {
			System.out.println("Temperature is invalid!");
		} else if(windSpeed < 2) {
			System.out.println("Wind speed is invalid!");
		} else {
			double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16))
				+ (0.4275 * temp * Math.pow(windSpeed, 0.16));
		
			System.out.println("The wind chill index is " + windChill);
		}

	}

}
