package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Using the &&, || and ^ operators.
 * @author jconnolly
 *
 */

public class Exercise3_26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		boolean perfect;
		int sqrt = (int) (Math.sqrt(number));
		if(sqrt * sqrt == number) {
			perfect = true;
		} else {
			perfect = false;
		}
		boolean even = number % 2 == 0;
		
		if(even && perfect == true) {
			System.out.println("Is " + number + " even and a perfect square? " + true);
			System.out.println("Is " + number + " even or a perfect square? " + true);
			System.out.println("Is " + number + " even or a perfect square, but not both? " + false);
		} else {
			System.out.println("Is " + number + " even and a perfect square? " + false);
			System.out.println("Is " + number + " even or a perfect square? " + true);
			System.out.println("Is " + number + " even or a perfect square, but not both? " + true);
		}

	}

}
