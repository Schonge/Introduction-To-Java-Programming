package com.jconnolly.chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: Rolling a die.
 * @author jconnolly
 *
 */

public class Exercise3_14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Guess the number of the die roll: ");
		int guess = input.nextInt();
		
		Random rand = new Random();
		int dieRoll = rand.nextInt(6);
		dieRoll++;
		
		if(guess == dieRoll) {
			System.out.println("The die rolled a " + dieRoll);
			System.out.println("You guessed a " + guess);
			System.out.println("CONGRATULATIONS! You win!");
		} else {
			System.out.println("The die rolled a " + dieRoll);
			System.out.println("You guessed a " + guess);
			System.out.println("Better luck next time! You lose!");
		}

	}

}
