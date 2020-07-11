package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Game: Lottery.
 * @author jconnolly
 *
 */

public class Exercise4_32 {

	public static void main(String[] args) {
		
		int lotteryDigit1 = (int)(Math.random() * 10);
		int lotteryDigit2;
		
		do {
			lotteryDigit2 = (int)(Math.random() * 10);
		}
		while(lotteryDigit1 == lotteryDigit2);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (Two digits): ");
		int number = input.nextInt();
		
		int playerDigit1 = number / 10;
		int playerDigit2 = number % 10;
		
		System.out.println("The lottery number is " + lotteryDigit1 + "" + lotteryDigit2);
		
		if(playerDigit1 == lotteryDigit1 && playerDigit2 == lotteryDigit2) {
			System.out.println("Exact match: You win $10,000!");
		} else if(playerDigit1 == lotteryDigit2 && playerDigit2 == lotteryDigit1) {
			System.out.println("Match all digits: You win $3,000");
		} else {
			System.out.println("Sorry, no match!");
		}

	}

}
