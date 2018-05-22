package com.jconnolly.chapter3;

import java.util.Scanner;

/**
 * Financial Application: Monetary units.
 * @author jconnolly
 *
 */

public class Exercise3_07 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount as an integer e.g. 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;
		
		String output = "Your amount " + amount + " consists of\n";
		if(numberOfOneDollars != 0) {
			if(numberOfOneDollars == 1) {
				output = output + "\t" + numberOfOneDollars + " dollar\n";
			} else {
				output = output + "\t" + numberOfOneDollars + " dollars\n";
			}
		}
		if(numberOfQuarters != 0) {
			if(numberOfQuarters == 1) {
				output = output + "\t" + numberOfQuarters + " quarter\n";
			} else {
				output = output + "\t" + numberOfQuarters + " quarters\n";
			}
		}
		if(numberOfDimes != 0) {
			if(numberOfDimes == 1) {
				output = output + "\t" + numberOfDimes + " dime\n";
			} else {
				output = output + "\t" + numberOfDimes + " dimes\n";
			}
		}
		if(numberOfNickels != 0) {
			if(numberOfNickels == 1) {
				output = output + "\t" + numberOfNickels + " nickel\n";
			} else {
				output = output + "\t" + numberOfNickels + " nickels\n";
			}
		}
		if(numberOfPennies != 0) {
			if(numberOfPennies == 1) {
				output = output + "\t" + numberOfPennies + " penny\n";
			} else {
				output = output + "\t" + numberOfPennies + " pennies\n";
			}
		}
		
		System.out.println(output);
	}

}
