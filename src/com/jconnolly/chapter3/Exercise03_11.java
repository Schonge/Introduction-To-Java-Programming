package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Finding the number of days in a month
 */

public class Exercise03_11 {

    public static void main(String[] args) {
        JTextField monthInput = new JTextField(5);
        JTextField yearInput = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Month:"));
        myPanel.add(monthInput);
        myPanel.add(new JLabel("Year:"));
        myPanel.add(yearInput);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Enter a month and year to return the number of days for that month:", JOptionPane.OK_CANCEL_OPTION);

        if(input == JOptionPane.OK_OPTION) {
            String month = monthInput.getText();
            int year = Integer.parseInt(yearInput.getText());
            int numOfDays = 0;

            String message = "";

            if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June")
             || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
                numOfDays = 30;
            } else if(month.equalsIgnoreCase("February")) {
                if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
            } else {
                numOfDays = 31;
            }
            
            message = month + " " + year + " has " + numOfDays + " days.";

            JOptionPane.showMessageDialog(null, message);
        }
    }

}