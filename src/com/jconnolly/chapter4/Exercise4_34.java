package com.jconnolly.chapter4;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: Scissor, rock, paper.
 * @author jconnolly
 *
 */

public class Exercise4_34 {

	public static void main(String[] args) {

		int playerWins = 0;
		int computerWins = 0;
		
		while(playerWins < 3 && computerWins < 3) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your choice, scissors(0), rock(1), paper(2): ");
			int userChoice = input.nextInt();
			
			Random rand = new Random();
			int compChoice = rand.nextInt(3);
			
			if(userChoice == 0 && compChoice == 1) {
				System.out.println("The computer is rock. You are scissors. You lose!");
				computerWins++;
				playerWins = 0;
			} else if(userChoice == 2 && compChoice == 1) {
				System.out.println("The computer is rock. You are paper. You win!");
				playerWins++;
				computerWins = 0;
			} else if(userChoice == 1 && compChoice == 2) {
				System.out.println("The computer is paper. You are rock. You lose!");
				computerWins++;
				playerWins = 0;
			} else if(userChoice == 0 && compChoice == 2) {
				System.out.println("The computer is paper. You are scissors. You win!");
				playerWins++;
				computerWins = 0;
			} else if(userChoice == 1 && compChoice == 0) {
				System.out.println("The computer is scissors. You are rock. You win!");
				playerWins++;
				computerWins = 0;
			} else if(userChoice == 2 && compChoice == 0) {
				System.out.println("The computer is scissors. You are paper. You lose!");
				computerWins++;
				playerWins = 0;
			} else if(userChoice == 0 && compChoice == 0) {
				System.out.println("The computer is scissors. You are scissors too. It is a draw!");
				playerWins = 0;
				computerWins = 0;
			} else if(userChoice == 1 && compChoice == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw!");
				playerWins = 0;
				computerWins = 0;
			} else {
				System.out.println("The computer is paper. You are paper too. It is a draw!");
				playerWins = 0;
				computerWins = 0;
			}
		
		}
		
		if(playerWins > 2) {
			System.out.println("Congratulations! You won 3 in a row!");
		} else {
			System.out.println("Sorry, you lost 3 in a row! Please try again.");
		}

	}

}
