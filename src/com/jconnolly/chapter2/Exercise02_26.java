package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Finding the number of hours.
 */

public class Exercise02_26 {

    public static void main(String[] args) {
        String inputSeconds = JOptionPane.showInputDialog(null, "Enter the number of seconds:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int numOfSecs = Integer.parseInt(inputSeconds);

        int hours = numOfSecs / 3600;
        int remainingSeconds = numOfSecs % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        String output = numOfSecs + " seconds is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.";
        JOptionPane.showMessageDialog(null, output);
    }
    
}