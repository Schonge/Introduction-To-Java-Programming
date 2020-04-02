package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Conversion between miles and kilometers.
 * @author jconnolly
 *
 */

public class Exercise4_06 {

	public static void main(String[] args) {
		System.out.println("Miles			Kilometers			Kilometers			Miles");
		for(int i = 1, j = 20; i <= 10; i++, j += 5) {
			double kilometers = i * 1.609;
			double miles = j / 1.609;
			DecimalFormat dec = new DecimalFormat("###.###");
			System.out.println(i + "			" + dec.format(kilometers) + "				"
					+ j + "				" + dec.format(miles));
		}

	}

}
