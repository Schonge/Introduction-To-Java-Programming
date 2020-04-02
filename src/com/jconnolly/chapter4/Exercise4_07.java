package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Financial Application: Computing future tuition.
 * @author jconnolly
 *
 */

public class Exercise4_07 {

	public static void main(String[] args) {
		double tuition = 10000;
		double yearlyIncreaseRate = 0.05;
		for(int i = 1; i < 10; i++) {
			tuition += tuition * yearlyIncreaseRate;
		}
		DecimalFormat dec = new DecimalFormat("######.##");
		System.out.println("Tuition cost after 10 years is $" + dec.format(tuition));
		
		double newTuition = tuition;
		double totalTuition = newTuition;
		for(int j = 1; j < 4; j++) {
			newTuition += newTuition * yearlyIncreaseRate;
			totalTuition += newTuition;
		}
		System.out.println("Total tuition for 4 years costs $" + dec.format(totalTuition));

	}

}
