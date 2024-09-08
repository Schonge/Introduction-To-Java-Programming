package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Conversions between Celsius and Gahrenheit
 */

public class Exercise05_08 {

    public static void main(String[] args) {
        String result = "Celsius        Fahrenheit      Fahrenheit      Celsius\n";

        double celsius = 40;
        double farenheit = 120;

        for (int i = 1; i <= 10; celsius--, farenheit -= 10, i++) {
            result += celsius + "               " + String.format("%.2f", celsiusToFahrenheit(celsius)) + "                 " 
            + farenheit + "                 " + String.format("%.2f", fahrenheitToCelsius(farenheit)) + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}