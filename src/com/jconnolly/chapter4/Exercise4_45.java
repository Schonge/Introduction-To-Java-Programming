package com.jconnolly.chapter4;

/**
 * Math: Combinations.
 * @author jconnolly
 *
 */

public class Exercise4_45 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i != j) {
					System.out.println(i + " " + j);
				}
			}
		}
		
	}

}
