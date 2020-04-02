package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Conversion between grams and ounces.
 * @author jconnolly
 *
 */

public class Exercise4_05 {

	public static void main(String[] args) {
		System.out.println("Grams			Ounces			Ounces			Grams");
		for(int i = 1, j = 5; i < 200; i += 2, j += 5) {
			double ounces = i * 0.035;
			double grams = j / 0.035;
			DecimalFormat dec = new DecimalFormat("###.###");
			System.out.println(i + "			" + dec.format(ounces) + "			"
					+ j + "			" + dec.format(grams));
		}

	}

}
