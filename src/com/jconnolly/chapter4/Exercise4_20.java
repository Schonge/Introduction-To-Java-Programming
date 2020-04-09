package com.jconnolly.chapter4;

/**
 * Printing prime numbers between 2 and 1500.
 * @author jconnolly
 *
 */

public class Exercise4_20 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 15;
		
		int count = 0;
		int number = 2;
		
		while(number < 1500) {
			boolean isPrime = true;
			
			for(int divisor = 2; divisor <= number / 2; divisor++) {
				if(number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
	
}