package com.jconnolly.chapter4;

/**
 * Computing e.
 * @author jconnolly
 *
 */

public class Exercise4_26 {

	public static void main(String[] args) {
	
		for (int i = 10000; i <= 100000; i += 10000)
		{
			double e = 1.0;
			double item = 1.0;
			
			for (int j = 1; j <= i; j++)
			{
				item /= j;
				e += item;
			}			
			System.out.println("Where i is " + i + ", e is approximately " + e);
		}

	}

}
