package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Business: checking ISBN.
 */

public class Exercise03_09 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the first nine digits of the ISBN:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int isbn = Integer.parseInt(input);
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        String checksum = "X";
        String message = "";

        d9 = isbn % 10;
        d8 = (isbn / 10) % 10;
        d7 = (isbn / 100) % 10;
        d6 = (isbn / 1000) % 10;
        d5 = (isbn / 10000) % 10;
        d4 = (isbn / 100000) % 10;
        d3 = (isbn / 1000000) % 10;
        d2 = (isbn / 10000000) % 10;
        d1 = (isbn / 100000000) % 10;

        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(d10 == 10) {
            message = "Your ISBN is: " + d1 + "-" + d2 + d3 + d4 + "-" + d5 + d6 + d7 + d8 + d9 + "-" + checksum;
        } else {
            message = "Your ISBN is: " + d1 + "-" + d2 + d3 + d4 + "-" + d5 + d6 + d7 + d8 + d9 + "-" + d10;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}