package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Science: wind-chill temperature.
 */

public class Exercise02_17 {

    public static void main(String[] args) {
        String inputTemp = JOptionPane.showInputDialog(null, "Enter the temperature in Fahrenheit:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double temperature = Double.parseDouble(inputTemp);

        String inputWindSpeed = JOptionPane.showInputDialog(null, "Enter the wind speed in miles per hour:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double windSpeed = Double.parseDouble(inputWindSpeed);

        double windChill = 35.74 + (0.6215 * temperature) - (35.57 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        String output = "The wind chill index is " + windChill;
        JOptionPane.showMessageDialog(null, output);
    }
    
}