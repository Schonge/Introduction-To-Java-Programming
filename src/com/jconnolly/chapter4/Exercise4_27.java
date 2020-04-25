package com.jconnolly.chapter4;

/**
 * Displaying leap years.
 * @author jconnolly
 *
 */

public class Exercise4_27 {

	public static void main(String[] args) {
		final int LEAP_YRS_PER_LINE = 10;
		final int LEAP_YR_START = 2001;
		final int LEAP_YR_END = 2100;
		
		int count = 0;
		for(int year = LEAP_YR_START; year <= LEAP_YR_END; year++) {
			boolean isLeapYr = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			
			if(isLeapYr) {
				count++;
				if(count % LEAP_YRS_PER_LINE == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}
			}
		}

	}

}
