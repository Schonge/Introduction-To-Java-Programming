package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Decimal to hex.
 * @author jconnolly
 *
 */

public class Exercise4_38 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();
		int number = decimal;
		
		String hex = "";
		while(decimal > 0) {
			int hexDigit = (decimal % 16);
			switch(hexDigit) {
				case 10:
					hex = "A" + hex;
					break;
				case 11:
					hex = "B" + hex;
					break;
				case 12:
					hex = "C" + hex;
					break;
				case 13:
					hex = "D" + hex;
					break;
				case 14:
					hex = "E" + hex;
					break;
				case 15:
					hex = "F" + hex;
					break;
				default:
					hex = hexDigit + hex;
					break;
			}
			decimal /= 16 ;
		}
		
		System.out.println("The hex representation of " + number + " is " + hex);
		
	}

}
