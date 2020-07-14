package com.jconnolly.chapter5;

/**
 * Conversions between Inches and Centimeters.
 * @author jconnolly
 *
 */

public class Exercise5_09 {

	public static void main(String[] args) {
		
		final double MAX_INCH = 10.0;
		final double MIN_INCH = 1.0;
		final double MAX_CENTIMETER = 50.0;
		final double MIN_CENTIMETER = 5.0;
		final double INCH_CHANGE = 1.0;
		final double CENTIMETER_CHANGE = 5.0;
		
		System.out.println("Inch\t\tCentimeter\tCentimeter\tInch");
		
		for(double inch = MIN_INCH, centimeter = MIN_CENTIMETER; (inch <= MAX_INCH) &&
				(centimeter <= MAX_CENTIMETER);	inch += INCH_CHANGE, centimeter += CENTIMETER_CHANGE) {
			System.out.printf("%-4.1f\t\t%-5.2f\t\t%-4.1f\t\t%-7.2f\n", inch, inchToCentimeter(inch), 
					centimeter, centimeterToInch(centimeter));
		}
		System.out.println();
		
	}
	
	public static double inchToCentimeter(double in) {
		return (2.54 * in);
	}
	
	public static double centimeterToInch(double cm) {
		return (cm / 2.54);
	}

}
