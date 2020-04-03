package com.jconnolly.chapter4;

import java.util.Scanner;

/**
 * Finding the highest score.
 * @author jconnolly
 *
 */

public class Exercise4_08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of students: ");
		int numOfStudents = input.nextInt();
		
		double highScore = 0;
		String highStudent = "";
		for(int i = 0; i < numOfStudents; i++) {
			System.out.print("Student's Name: ");
			String fname = input.next();
			String lname = input.next();
			System.out.print("Score: ");
			double score = input.nextDouble();
			
			if(score >= highScore) {
				highScore = score;
				highStudent = fname + " " + lname;
			}			
		}
		
		System.out.println(highStudent + " had the highest score " + highScore + "%");
	}

}
