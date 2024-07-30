package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Using the input dialog box.
 */

public class Exercise03_18 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int year = Integer.parseInt(input);

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        JOptionPane.showMessageDialog(null, year + " is a leap year? " + isLeapYear);
    }

}