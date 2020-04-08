package com.jconnolly.chapter4;

/**
 * Printing four patterns using loops.
 * @author jconnolly
 *
 */

public class Exercise4_18C {

	public static void main(String[] args) {
		final int ROWS = 6;
		
		System.out.println("Pattern III");
		
		for (int row = 1; row <= ROWS; row++)
		{
			for (int space = row; space < ROWS; space++)
			{
				System.out.print("  ");
			}
			
			for (int column = row; column >= 1; column--)
			{
				System.out.print(column + " ");
			}		
			System.out.println();
		}
	}

}
