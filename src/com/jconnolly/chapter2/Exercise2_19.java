package com.jconnolly.chapter2;

/**
 * Random character.
 * @author jconnolly
 *
 */

public class Exercise2_19 {
	
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		int time = (int)(millis % 26) + 65;
		char letter = (char)time;
		char uppercaseLetter = Character.toUpperCase(letter);
		
		System.out.println("The uppercase character is " + uppercaseLetter);
	}

}
