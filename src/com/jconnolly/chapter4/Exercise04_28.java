package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Displaying the last day of each month.
 */

public class Exercise04_28 {

    public static void main(String[] args) {
        JTextField yearInput = new JTextField(5);
        JTextField dayInput = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter year:"));
        myPanel.add(yearInput);
        myPanel.add(new JLabel("Enter first day of year as an integer(Sunday is 0 etc.):"));
        myPanel.add(dayInput);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Display Last Day", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int year = Integer.parseInt(yearInput.getText());
            int day = Integer.parseInt(dayInput.getText());

            for(int month = 1; month <= 12; month++) {
                int daysInMonth = 0;
                // February
                if(month == 2) {
                    // Leap Year
                    if((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                    // April, June, September, November
                    daysInMonth = 30;
                } else {
                    // Rest of the months
                    daysInMonth = 31;
                }

                int lastDayofWeek = (day + daysInMonth - 1) % 7;

                String dayName = "";
                switch (lastDayofWeek) {
                    case 0:
                        dayName = "Sunday";
                        break;
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                }

                String monthName = "";
                switch (month) {
                    case 1:
                        monthName = "January";
                        break;
                    case 2:
                        monthName = "February";
                        break;
                    case 3:
                        monthName = "March";
                        break;
                    case 4:
                        monthName = "April";
                        break;
                    case 5:
                        monthName = "May";
                        break;
                    case 6:
                        monthName = "June";
                        break;
                    case 7:
                        monthName = "July";
                        break;
                    case 8:
                        monthName = "August";
                        break;
                    case 9:
                        monthName = "September";
                        break;
                    case 10:
                        monthName = "October";
                        break;
                    case 11:
                        monthName = "November";
                        break;
                    case 12:
                        monthName = "December";
                        break;
                }

                message += monthName + " " + daysInMonth + ", " + year + " is " + dayName + ".\n";

                // Starting day for next month
                day = (lastDayofWeek + 1) % 7;
            }

        }

        JOptionPane.showMessageDialog(null, message);
    }

}