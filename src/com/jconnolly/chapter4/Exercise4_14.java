package com.jconnolly.chapter4;

/**
 * Displaying the ASCII character table.
 * @author jconnolly
 *
 */

public class Exercise4_14 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 33; i < 127; i++) {
			if(count < 10) {
				System.out.print((char)i + " ");
				count++;
			} else {
				System.out.print("\n" + (char)i + " ");
				count = 1;
			}
		}

	}

}
