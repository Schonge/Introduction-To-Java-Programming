package com.jconnolly.chapter4;

/**
 * Summation.
 * @author jconnolly
 *
 */

public class Exercise4_35 {

	public static void main(String[] args) {
		
		double sum = 0.0;
		
		for (int i = 1; i < 625; i++)
		{
			double denominator = Math.pow(i, 0.5) + Math.pow(i + 1, 0.5);			
			sum += (1 / denominator);
		}
		
		System.out.println("The summation is " + sum);
		
	}

}
