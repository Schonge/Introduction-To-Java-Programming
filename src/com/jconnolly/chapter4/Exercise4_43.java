package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Simulation: Clock countdown.
 * @author jconnolly
 *
 */

public class Exercise4_43 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		for(int i = seconds - 1; i > 0 ; i--) {
			if(i < 2) {
				System.out.println(i + " second remaining");
			} else {
				System.out.println(i + " seconds remaining");
			}
		}
		System.out.println("Stopped");
		
	}

}
