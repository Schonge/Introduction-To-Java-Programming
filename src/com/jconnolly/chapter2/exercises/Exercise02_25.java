package com.jconnolly.chapter2.exercises;

import javax.swing.JOptionPane;

/*
 * Current time.
 */

public class Exercise02_25 {

    public static void main(String[] args) {
        String inputTZOffset = JOptionPane.showInputDialog(null, "Enter the time zone offset to GMT:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        long tzOffset = Long.parseLong(inputTZOffset);

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + tzOffset;

        String output = "The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT";
        JOptionPane.showMessageDialog(null, output);
    }
    
}