package com.jconnolly.chapter5;

/**
 * Using the isPrime method.
 * @author jconnolly
 *
 */

public class Exercise5_10 {

	public static void main(String[] args) {
		
		final int MAX_NUMBER = 10000;
		
		System.out.println("The total number of prime numbers less than 10000 is " + countPrimeNumbers(MAX_NUMBER));
		
	}
	
	public static int countPrimeNumbers(int maxNumber) {
		int count = 0;
		for(int i = 2; i < maxNumber; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
