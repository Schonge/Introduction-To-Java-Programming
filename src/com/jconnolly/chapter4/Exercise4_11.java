package com.jconnolly.chapter4;

/**
 * Finding numbers divisible by 5 or 6, but not both.
 * @author jconnolly
 *
 */

public class Exercise4_11 {

	public static void main(String[] args) {
		
		int i = 100, count = 0;
		for(i = 100; i <= 200; i++) {
			if((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
				if(count < 10) {
					System.out.print(i + " ");
					count++;
				} else {
					System.out.println();
					count = 0;
				}
			}
		}

	}

}
