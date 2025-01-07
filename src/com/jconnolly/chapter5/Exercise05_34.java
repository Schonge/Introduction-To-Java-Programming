package com.jconnolly.chapter5;

import javax.swing.*;
import java.awt.*;

/*
 * Printing calendar.
 */

public class Exercise05_34 {

    public static void main(String[] args) {
        JTextField yearField = new JTextField(5);
        JTextField monthField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter year:"));
        myPanel.add(yearField);
        myPanel.add(new JLabel("Enter month:"));
        myPanel.add(monthField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Print Calendar", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int year = Integer.parseInt(yearField.getText());
            int month = Integer.parseInt(monthField.getText());

            message = printCalendarHeader(month, year) + "\n" + printFirstDay(month, year) + printCalendar(month, year);
        }

        JOptionPane.showMessageDialog(null, new JTextArea(message));
    }

    public static String printCalendarHeader(int month, int year) {
        String header = "";

        header = "\t\t\t" + getMonthName(month) + "\t" + "\n" +
            "\t\t\t  " + year + "\n" +
            "-----------------------------------------------------------------------------------------------------------------------------------" + "\n" +
            "Sun\tMon\tTue\tWed\tThu\tFri\tSat";

        return header;
    }

    public static String printFirstDay(int month, int year) {
        int firstDay = zellarsAlgorithm(1, month, year);

        String leadingTabs = "1";


        for (int i = 1; i < firstDay; i++) {
            leadingTabs = "\t" + leadingTabs;
        }
        if (firstDay == 0) {
            leadingTabs = "\t\t\t\t\t\t1";
        }

        return leadingTabs + "\t";
    }

    public static String printCalendar(int month, int year) {
        String calendar = "";
        int lastDayOfMonth = lastDayOfMonth(month, year);

        for (int i = 2; i <= lastDayOfMonth; i++) {
            int printedDay = zellarsAlgorithm(i, month, year);
            if (printedDay == 1) {
                calendar += "\n";
            }
            calendar += i + "\t";
        }

        return calendar;
    }

    public static int zellarsAlgorithm(int dayOfMonth, int month, int year) {
        if(month == 1 || month == 2) {
            month += 12;
            year--;
        }

        // k represents the year of the century and j represents the century in the formula
        int k = year % 100;
        int j = year / 100;
        // q will represent the day(date) in the formula
        int q = dayOfMonth;
        // m will represent the month in the formula
        int m = month;

        // calculated day of the week
        return (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "ERROR";
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int lastDayOfMonth(int month, int year) {
        int lastDayOfMonth;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            lastDayOfMonth = 30;
        } else if (month == 2) {
            lastDayOfMonth = isLeapYear(year) ? 29 : 28;
        } else {
            lastDayOfMonth = 31;
        }
        return lastDayOfMonth;
    }

}