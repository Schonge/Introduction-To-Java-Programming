package com.jconnolly.chapter4;

/**
 * Finding numbers divisible by 5 and 6.
 * @author jconnolly
 *
 */

public class Exercise4_10 {

	public static void main(String[] args) {
		
		int i = 100, count = 0;
		for(i = 100; i <= 1000; i++) {
			if(i % 5 == 0 && i % 6 == 0) {
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
