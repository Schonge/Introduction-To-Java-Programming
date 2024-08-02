package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Science: day of the week.
 */

public class Exercise03_21 {

    public static void main(String[] args) {
        JTextField yearField = new JTextField(5);
        JTextField monthField = new JTextField(5);
        JTextField dayField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter year:"));
        myPanel.add(yearField);
        myPanel.add(new JLabel("Enter month:"));
        myPanel.add(monthField);
        myPanel.add(new JLabel("Enter day:"));
        myPanel.add(dayField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Calculate Day of the Week", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int year = Integer.parseInt(yearField.getText());
            int month = Integer.parseInt(monthField.getText());
            int day = Integer.parseInt(dayField.getText());

            // m will represent month in the formula
            int m;

            if(month == 1) {
                m = 13;
                year = year - 1;
            } else if(month == 2) {
                m = 14;
                year = year - 1;
            } else {
                m = month;
            }

            // k represents the year of the century and j represents the century in the formula
            int k = year % 100;
            int j = year / 100;
            // q will represent the day(date) in the formula
            int q = day;

            // h will represent the calculated day of the week
            int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

            String dayOfTheWeek = "";
            
            switch (h) {
                case 0:
                    dayOfTheWeek = "Saturday";
                    break;
            
                case 1:
                    dayOfTheWeek = "Sunday";
                    break;

                case 2:
                    dayOfTheWeek = "Monday";
                    break;

                case 3:
                    dayOfTheWeek = "Tuesday";
                    break;

                case 4:
                    dayOfTheWeek = "Wednesday";
                    break;

                case 5:
                    dayOfTheWeek = "Thursday";
                    break;

                case 6:
                    dayOfTheWeek = "Friday";
                    break;
            }

            message = "Day of the week is " + dayOfTheWeek;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}