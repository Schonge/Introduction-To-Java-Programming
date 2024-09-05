package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Sorting three numbers.
 */

public class Exercise05_05 {

    public static void main(String[] args) {
        JTextField numOneField = new JTextField(5);
        JTextField numTwoField = new JTextField(5);
        JTextField numThreeField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Number 1:"));
        myPanel.add(numOneField);
        myPanel.add(new JLabel("Number 2:"));
        myPanel.add(numTwoField);
        myPanel.add(new JLabel("Number 3:"));
        myPanel.add(numThreeField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter Three Numbers:", JOptionPane.OK_CANCEL_OPTION);
        
        if(input == JOptionPane.OK_OPTION) {
            double numOne = Double.parseDouble(numOneField.getText());
            double numTwo = Double.parseDouble(numTwoField.getText());
            double numThree = Double.parseDouble(numThreeField.getText());

            displaySortedNumbers(numOne, numTwo, numThree);
        }
        
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        String result = "The numbers in decreasing order are ";
        if(num1 >= num2 && num1 >= num3 && num2 >= num3) {
            result += num1 + ", " + num2 + ", " + num3; 
        } else if(num1 >= num2 && num3 >= num2 && num1 >= num3) {
            result += num1 + ", " + num3 + ", " + num2;
        } else if(num2 >= num1 && num2 >= num3 && num1 >= num3) {
            result += num2 + ", " + num1 + ", " + num3;
        } else if(num2 >= num1 && num2 >= num3 && num3 >= num1) {
            result += num2 + ", " + num3 + ", " + num1;
        } else if(num3 >= num1 && num3 >= num2 && num1 >= num2) {
            result += num3 + ", " + num1 + ", " + num2;
        } else {
            result += num3 + ", " + num2 + ", " + num1;
        }

        JOptionPane.showMessageDialog(null, result);
    }

}