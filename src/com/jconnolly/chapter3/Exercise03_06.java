package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Health application: BM!.
 */

public class Exercise03_06 {

    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        JTextField weightField = new JTextField(5);
        JTextField feetField = new JTextField(5);
        JTextField inchesField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Weight:"));
        myPanel.add(weightField);
        myPanel.add(new JLabel("Feet:"));
        myPanel.add(feetField);
        myPanel.add(new JLabel("Inches:"));
        myPanel.add(inchesField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter your weight, and height in feet and inches :", JOptionPane.OK_CANCEL_OPTION);

        if(input == JOptionPane.OK_OPTION) {
            double weight = Double.parseDouble(weightField.getText());
            double feet = Double.parseDouble(feetField.getText());
            double inches = Double.parseDouble(inchesField.getText());

            double weightInKilos = weight * KILOGRAMS_PER_POUND;
            double heightInMeters = ((feet * 12) + inches) * METERS_PER_INCH;
            double bmi = weightInKilos / (heightInMeters * heightInMeters);
            String result;
            if(bmi < 16) {
                result = "seriously underweight";
            } else if(bmi < 18) {
                result = "underweight";
            } else if(bmi < 24) {
                result = "normal weight";
            } else if(bmi < 29) {
                result = "overweight";
            } else if(bmi < 35) {
                result = "seriously overweight";
            } else {
                result = "gravely overweight";
            }

            String message = "Your BMI is " + bmi + "\nYou are " + result;
            JOptionPane.showMessageDialog(null, message);
        }
    }
    
}