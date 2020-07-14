package com.jconnolly.chapter5;

/**
 * Conversions between Celsius and Fahrenheit.
 * @author jconnolly
 *
 */

public class Exercise5_08 {

	public static void main(String[] args) {
		
		final double MAX_CELSIUS = 40.0;
		final double MIN_CELSIUS = 31.0;
		final double MAX_FAHRENHEIT = 120.0;
		final double MIN_FAHRENHEIT = 30.0;
		final double CELSIUS_CHANGE = 1.0;
		final double FAHRENHEIT_CHANGE = 10.0;
		
		System.out.println("Celsius\t\tFahrenheit\tFahrenheit\tCelsius");
		
		for(double celsius = MAX_CELSIUS, fahrenheit = MAX_FAHRENHEIT; (celsius >= MIN_CELSIUS) &&
				(fahrenheit >= MIN_FAHRENHEIT);	celsius -= CELSIUS_CHANGE, fahrenheit -= FAHRENHEIT_CHANGE) {
			System.out.printf("%-4.1f\t\t%-5.1f\t\t%-5.1f\t\t%-5.2f\n", celsius, celsiusToFahrenheit(celsius), 
					fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
		System.out.println();
		
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return ((9.0 / 5) * celsius) + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
