package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Business Application: Checking ISBN.
 * @author jconnolly
 *
 */

public class Exercise4_36 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int isbnLastDigit = 0;
		int isbnFirstNineDigits = 0;
		int length = 0;
		String isbn = "";
		
		do {
			System.out.print("Enter the first nine digits of the ISBN: ");
			isbnFirstNineDigits = input.nextInt();
			length = String.valueOf(isbnFirstNineDigits).length();
		} while(length != 9);
		
		for(int i = 9; i > 0; i--) {
			int digit = isbnFirstNineDigits % 10;
			isbnFirstNineDigits /= 10;
			isbnLastDigit += (digit * i);
			isbn = digit + isbn;
		}
		
		isbnLastDigit %= 11; //checksum
		if(isbnLastDigit == 10) {
			isbn += "X";
		} else {
			isbn += isbnLastDigit;
		}
		
		System.out.println("The ISBN is " + isbn);
		
	}

}
