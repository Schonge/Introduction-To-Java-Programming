package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Number of days in a month.
 */

public class Exercise05_16 {

    public static void main(String[] args) {
        String result = "";

        String input = JOptionPane.showInputDialog(null, "Enter a month (January = 1):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int month = Integer.parseInt(input);

        switch (month) {
            case 1:
                result += "January";
                break;
            case 2:
                result += "February";
                break;
            case 3:
                result += "March";
                break;
            case 4:
                result += "April";
                break;
            case 5:
                result += "May";
                break;
            case 6:
                result += "June";
                break;
            case 7:
                result += "July";
                break;
            case 8:
                result += "August";
                break;
            case 9:
                result += "September";
                break;
            case 10:
                result += "October";
                break;
            case 11:
                result += "November";
                break;
            case 12:
                result += "December";
                break;
            default:
                break;
        }

        result += " has " + daysInMonth(month) + " days.";
        
        JOptionPane.showMessageDialog(null, result);
    }

    public static int daysInMonth(int month) {
        int days = 0;

        if(month == 2) {
            days = 28;
        } else if(month == 4 || month == 6|| month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        return days;
    }

}