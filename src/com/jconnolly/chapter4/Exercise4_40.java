package com.jconnolly.chapter4;

/**
 * Simulation: Rolling a die.
 * @author jconnolly
 *
 */

public class Exercise4_40 {

	public static void main(String[] args) {
		
		int oneOccurrences = 0;
		int twoOccurrences = 0;
		int threeOccurrences = 0;
		int fourOccurrences = 0;
		int fiveOccurrences = 0;
		int sixOccurrences = 0;
		
		for(int i = 1; i <= 1000000; i++) {
			int dieRoll = (int)(Math.random() * 6) + 1;
			switch(dieRoll) {
				case 1:
					oneOccurrences++;
					break;
				case 2:
					twoOccurrences++;
					break;
				case 3:
					threeOccurrences++;
					break;
				case 4:
					fourOccurrences++;
					break;
				case 5:
					fiveOccurrences++;
					break;
				case 6:
					sixOccurrences++;
					break;
			}
		}
		
		System.out.println("During a simulation of rolling a die 1 million times, a 1 occured " +
				oneOccurrences + " times, a 2 occurred " + twoOccurrences + " times, a 3 occurred " +
				threeOccurrences + " times, a 4 occurred " + fourOccurrences + " times, a 5 occurred " +
				fiveOccurrences + " times and a 6 occurred " + sixOccurrences + " times.");

	}

}
