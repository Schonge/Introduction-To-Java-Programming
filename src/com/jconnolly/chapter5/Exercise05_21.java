package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Statistics: computing mean and standard deviation.
 */

public class Exercise05_21 {

    public static void main(String[] args) {
        String result = "";

        JTextField num1Text = new JTextField(5);
        JTextField num2Text = new JTextField(5);
        JTextField num3Text = new JTextField(5);
        JTextField num4Text = new JTextField(5);
        JTextField num5Text = new JTextField(5);
        JTextField num6Text = new JTextField(5);
        JTextField num7Text = new JTextField(5);
        JTextField num8Text = new JTextField(5);
        JTextField num9Text = new JTextField(5);
        JTextField num10Text = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Number 1:"));
        myPanel.add(num1Text);
        myPanel.add(new JLabel("Number 2:"));
        myPanel.add(num2Text);
        myPanel.add(new JLabel("Number 3:"));
        myPanel.add(num3Text);
        myPanel.add(new JLabel("Number 4:"));
        myPanel.add(num4Text);
        myPanel.add(new JLabel("Number 5:"));
        myPanel.add(num5Text);
        myPanel.add(new JLabel("Number 6:"));
        myPanel.add(num6Text);
        myPanel.add(new JLabel("Number 7:"));
        myPanel.add(num7Text);
        myPanel.add(new JLabel("Number 8:"));
        myPanel.add(num8Text);
        myPanel.add(new JLabel("Number 9:"));
        myPanel.add(num9Text);
        myPanel.add(new JLabel("Number 10:"));
        myPanel.add(num10Text);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter 10 Numbers:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double num1 = Double.parseDouble(num1Text.getText());
            double num2 = Double.parseDouble(num2Text.getText());
            double num3 = Double.parseDouble(num3Text.getText());
            double num4 = Double.parseDouble(num4Text.getText());
            double num5 = Double.parseDouble(num5Text.getText());
            double num6 = Double.parseDouble(num6Text.getText());
            double num7 = Double.parseDouble(num7Text.getText());
            double num8 = Double.parseDouble(num8Text.getText());
            double num9 = Double.parseDouble(num9Text.getText());
            double num10 = Double.parseDouble(num10Text.getText());

            double mean = mean(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
            double standardDeviation = standardDeviation(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, mean);
            
            result += "The mean is " + mean + "\nThe standard deviation is " + standardDeviation;

            JOptionPane.showMessageDialog(null, result);
        }
    }

    public static double mean(double num1, double num2, double num3, double num4, double num5, double num6, double num7,
    double num8, double num9, double num10) {
        double mean = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
        return mean;
    }

    public static double standardDeviation(double num1, double num2, double num3, double num4, double num5, double num6, double num7,
    double num8, double num9, double num10, double mean) {
        // Get sum of squared differences from the mean
        double sumOfSquaredDiff = 0, standardDeviation = 0;
        sumOfSquaredDiff += Math.pow(num1 - mean, 2);
        sumOfSquaredDiff += Math.pow(num2 - mean, 2);
        sumOfSquaredDiff += Math.pow(num3 - mean, 2);
        sumOfSquaredDiff += Math.pow(num4 - mean, 2);
        sumOfSquaredDiff += Math.pow(num5 - mean, 2);
        sumOfSquaredDiff += Math.pow(num6 - mean, 2);
        sumOfSquaredDiff += Math.pow(num7 - mean, 2);
        sumOfSquaredDiff += Math.pow(num8 - mean, 2);
        sumOfSquaredDiff += Math.pow(num9 - mean, 2);
        sumOfSquaredDiff += Math.pow(num10 - mean, 2);

        // Get the standard deviation
        standardDeviation = Math.sqrt(sumOfSquaredDiff / 10);

        return standardDeviation;
    }

}