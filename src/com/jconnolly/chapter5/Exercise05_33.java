package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Current date and time.
 */

public class Exercise05_33 {

    public static void main(String[] args) {
        String message = "The current date and time is " + getCurrentDateTime();

        JOptionPane.showMessageDialog(null, message);
    }

    public static String getCurrentDateTime() {
        final int EPOCH_YEAR = 1970;

        // Elapsed time in milliseconds since midnight of January 1, 1970
        long currentTimeMillis = System.currentTimeMillis();

        // Get total seconds
        long totalSeconds = currentTimeMillis / 1000;

        // Current second
        long currentSecond = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds / 60;

        // Current minute
        long currentMinute = totalMinutes % 60;

        // Get total hours
        long totalHours = totalMinutes / 60;

        // Current hour
        long currentHour = totalHours % 24;

        // Get total days
        long totalDays = totalHours / 24;

        // Get current year
        int currentYear = EPOCH_YEAR;
        int daysInYear;

        while(true) {
            daysInYear = isLeapYear(currentYear) ? 366 : 365;
            if(totalDays >= daysInYear) {
                totalDays -= daysInYear;
                currentYear++;
            } else {
                break;
            }
        }

        // Get current month
        int currentMonth = 0;

        while(totalDays >= getDaysInMonth(currentMonth, currentYear)) {
            totalDays -= getDaysInMonth(currentMonth, currentYear);
            currentMonth++;
        }

        // Get current day
        int currentDay = (int)(totalDays + 1);

        String currentTime = String.format("%02d", currentHour) + ":"+ String.format("%02d", currentMinute) + ":" + String.format("%02d", currentSecond);

        return getMonthName(currentMonth) + " " + currentDay + ", " + currentYear + " " + currentTime;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
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

    private static int getDaysInMonth(int month, int currentYear) {
        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(currentYear) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }

}