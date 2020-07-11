package com.jconnolly.chapter4;

/**
 * Perfect numbers.
 * @author jconnolly
 *
 */

public class Exercise4_33 {

	public static void main(String[] args) {
		
		int number = 6;
		
		while(number < 10000) {
			int sumFactors = 0;
			int factor = number / 2;
			while(factor >= 1) {
				if(number % factor == 0) {
					sumFactors += factor;
				}
				factor--;
			}
			if(sumFactors == number) {
				System.out.println(number + " is a perfect number");
			}
			number++;
		}
		
	}

}
