package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Computer Architecture: Bit-level operations.
 * @author jconnolly
 *
 */

public class Exercise4_46 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		short number = input.nextShort();
		
		System.out.print("The bits are ");
		int mask = 1;
		for(int bitPos = 15; bitPos >= 0; bitPos--) {
			// Bitwise right shift operator
			int rightShift = number >> bitPos;
			int bit = rightShift & mask;
			System.out.print(bit);
		}
		
	}

}
