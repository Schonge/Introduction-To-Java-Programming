package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Displaying calendars.
 */

public class Exercise04_29 {

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

        String output = "";

        if(input == JOptionPane.OK_OPTION) {
            int year = Integer.parseInt(yearInput.getText());
            int startDay = Integer.parseInt(dayInput.getText());

            int daysInMonth = 0;
            for(int month = 1; month <= 12; month++) {
                switch (month) {
                    case 1:
                        output += "        January " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 2:
                        output += "        February " + year + "\n";
                        if((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) {
                            daysInMonth = 29;
                        } else {
                            daysInMonth = 28;
                        }
                        break;
                    case 3:
                        output += "        March " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 4:
                        output += "        April " + year + "\n";
                        daysInMonth = 30;
                        break;
                    case 5:
                        output += "        May " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 6:
                        output += "        June " + year + "\n";
                        daysInMonth = 30;
                        break;
                    case 7:
                        output += "        July " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 8:
                        output += "        August " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 9:
                        output += "        September " + year + "\n";
                        daysInMonth = 30;
                        break;
                    case 10:
                        output += "        October " + year + "\n";
                        daysInMonth = 31;
                        break;
                    case 11:
                        output += "        November " + year + "\n";
                        daysInMonth = 30;
                        break;
                    case 12:
                        output += "        December " + year + "\n";
                        daysInMonth = 31;
                        break;
                }
                // Create line under month and year
                for(int i = 0; i < 30; i++) {
                    output += "_";
                }
                // Create day of the week header
                output += "\nSun Mon Tue Wed Thu Fri Sat\n";

                for(int j = 0; j < startDay; j++) {
                    output += "     ";
                }
                for(int k = 1; k <= daysInMonth; k++) {
                    if(k < 10) {
                        output += "   " + k;
                    } else {
                        output += "  " + k;
                    }
                    if((k + startDay) % 7 == 0) {
                        output += "\n";
                    }
                }

                output += "\n";

                startDay = (startDay + daysInMonth) % 7;
            }

        }

        JOptionPane.showMessageDialog(null, output);
    }

}