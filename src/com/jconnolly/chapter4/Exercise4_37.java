package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Decimal to binary.
 * @author jconnolly
 *
 */

public class Exercise4_37 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();
		
		String binary = "";
		int count = 0;
		while(decimal > 0 || count % 4 != 0 || count == 0) {
			binary = (decimal % 2) + binary;
			decimal /=2 ;
			count++;
		}
		
		System.out.println("The binary representation of " + decimal + " is " + binary);

	}

}
