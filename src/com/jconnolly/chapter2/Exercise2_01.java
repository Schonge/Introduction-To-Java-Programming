package com.jconnolly.chapter2;

import java.util.Scanner;

/**
 * Converting Celsius to Farenheit.
 * @author jconnolly
 *
 */

public class Exercise2_01 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		int celsius = input.nextInt();
		
		double farenheit = ((9.0 / 5.0) * celsius) + 32;
		System.out.println(celsius + " Celsius is " + farenheit + " in Farenheit");
	}

}
