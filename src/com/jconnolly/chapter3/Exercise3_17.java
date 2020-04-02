package com.jconnolly.chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: Scissor, rock, paper.
 * @author jconnolly
 *
 */

public class Exercise3_17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your choice, scissors(0), rock(1), paper(2): ");
		int userChoice = input.nextInt();
		
		Random rand = new Random();
		int compChoice = rand.nextInt(3);
		
		if(userChoice == 0 && compChoice == 1) {
			System.out.println("The computer is rock. You are scissors. You lose!");
		} else if(userChoice == 2 && compChoice == 1) {
			System.out.println("The computer is rock. You are paper. You win!");
		} else if(userChoice == 1 && compChoice == 2) {
			System.out.println("The computer is paper. You are rock. You lose!");
		} else if(userChoice == 0 && compChoice == 2) {
			System.out.println("The computer is paper. You are scissors. You win!");
		} else if(userChoice == 1 && compChoice == 0) {
			System.out.println("The computer is scissors. You are rock. You win!");
		} else if(userChoice == 2 && compChoice == 0) {
			System.out.println("The computer is scissors. You are paper. You lose!");
		} else if(userChoice == 0 && compChoice == 0) {
			System.out.println("The computer is scissors. You are scissors too. It is a draw!");
		} else if(userChoice == 1 && compChoice == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw!");
		} else {
			System.out.println("The computer is paper. You are paper too. It is a draw!");
		}

	}

}
