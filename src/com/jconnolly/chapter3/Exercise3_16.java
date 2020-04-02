package com.jconnolly.chapter3;

/**
 * Random character.
 * @author jconnolly
 *
 */

public class Exercise3_16 {

	public static void main(String[] args) {
		char letter = (char)('a' + (Math.random() * ('z' - 'a')));
		
		System.out.println("The random lowercase letter is " + letter);

	}

}
