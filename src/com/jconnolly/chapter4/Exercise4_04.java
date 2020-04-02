package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Conversion from miles to kilometers.
 * @author jconnolly
 *
 */

public class Exercise4_04 {

	public static void main(String[] args) {
		System.out.println("Miles			Kilometers");
		for(int miles = 1; miles <= 10; miles++) {
			double kilometers = miles * 1.609;
			DecimalFormat dec = new DecimalFormat("###.###");
			System.out.println(miles + "			" + dec.format(kilometers));
		}

	}

}
