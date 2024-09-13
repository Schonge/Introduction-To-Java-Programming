package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Converting milliseconds to days hours minutes and seconds.
 */

public class Exercise05_25 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter number of milliseconds:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        long millis = Long.parseLong(input);

        JOptionPane.showMessageDialog(null, convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        return days + ":" + (hours % 24) + ":" + (minutes % 60) + ":" + (seconds % 60);
    }

}