package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Science: wind-chill temperature.
 */

public class Exercise03_20 {

    public static void main(String[] args) {
        JTextField tempField = new JTextField(5);
        JTextField windField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter the temperature in Fahrenheit between -58°F and 41°F:"));
        myPanel.add(tempField);
        myPanel.add(new JLabel("Enter the wind speed (>=2) in miles per hour:"));
        myPanel.add(windField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Wind-Chill Temperature", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            double temp = Double.parseDouble(tempField.getText());
            int windSpeed = Integer.parseInt(windField.getText());

            if(temp >= -58 && temp <= 41 && windSpeed >= 2) {
                double windChill = 35.74 + (0.6215 * temp) - (35.57 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
                message = "The wind-chill index is " + windChill;
            } else {
                message = "Please enter valid input.";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}