package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Sorting three integers.
 */

public class Exercise03_08 {

    public static void main(String[] args) {
        JTextField number1 = new JTextField(5);
        JTextField number2 = new JTextField(5);
        JTextField number3 = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Number 1:"));
        myPanel.add(number1);
        myPanel.add(new JLabel("Number 2:"));
        myPanel.add(number2);
        myPanel.add(new JLabel("Number 3:"));
        myPanel.add(number3);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter three positive numbers :", JOptionPane.OK_CANCEL_OPTION);

        if(input == JOptionPane.OK_OPTION) {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int num3 = Integer.parseInt(number3.getText());

            String message = "";

            if(num1 >= num2 && num1 >= num3) {
                if(num2 >= num3) {
                    message = num1 + " >= " + num2 + " >= " + num3;
                } else {
                    message = num1 + " >= " + num3 + " >= " + num2;
                }
            } else if(num2 >= num1 && num2 >= num3) {
                if(num1 >= num3) {
                    message = num2 + " >= " + num1 + " >= " + num3;
                } else {
                    message = num2 + " >= " + num3 + " >= " + num1;
                }
            } else {
                if(num1 >= num2) {
                    message = num3 + " >= " + num1 + " >= " + num2;
                } else {
                    message = num3 + " >= " + num2 + " >= " + num1;
                }
            }

            JOptionPane.showMessageDialog(null, message);
        }
    }
    
}