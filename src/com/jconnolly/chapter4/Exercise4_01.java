package com.jconnolly.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Counting positive and negative numbersand comparing the average of numbers.
 * @author jconnolly
 *
 */

public class Exercise4_01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer values, the program exits if the input is 0: ");
		int value, pos = 0, neg = 0, total = 0, count = 0;
		double average;
		do {
			value = input.nextInt();
			
			if(value > 0) {
				pos++;
				count++;
				total += value;
			}
			if(value < 0) {
				neg++;
				count++;
				total += value;
			}					
		} while(value != 0);
		DecimalFormat dec = new DecimalFormat("###.##");
		average = total / (count * 1.0);
		
		System.out.println("The number of positives is " + pos);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + dec.format(average));
	}

}
