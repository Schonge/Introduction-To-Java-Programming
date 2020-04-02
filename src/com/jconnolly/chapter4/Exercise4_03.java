package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Conversion from grams to ounces.
 * @author jconnolly
 *
 */

public class Exercise4_03 {

	public static void main(String[] args) {
		System.out.println("Grams			Ounces");
		for(int grams = 1; grams < 200; grams += 2) {
			double ounces = grams * 0.035;
			DecimalFormat dec = new DecimalFormat("###.###");
			System.out.println(grams + "			" + dec.format(ounces));
		}

	}

}
