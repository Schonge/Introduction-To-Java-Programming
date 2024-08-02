package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Displaying the ASCII character table.
 */

public class Exercise04_14 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int i = (int)'!'; i <= (int)'~'; i++) {
            result += (char)i + " ";
            perLineCounter++;

            if(perLineCounter % 10 == 0) {
                result += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}