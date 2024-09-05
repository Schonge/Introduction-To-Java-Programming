package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Business application: checking ISBN.
 */

public class Exercise04_36 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the first nine digits of the ISBN:",
        "Check ISBN", JOptionPane.QUESTION_MESSAGE);

        int isbn = Integer.parseInt(input);
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0;
        int d10;
        String checksum = "X";
        String result = "";

        for(int i = 0; i < 9; i++) {
            int digit = isbn % 10;
            switch(i) {
                case 0:
                    d9 = digit;
                    break;
                case 1:
                    d8 = digit;
                    break;
                case 2:
                    d7 = digit;
                    break;
                case 3:
                    d6 = digit;
                    break;
                case 4:
                    d5 = digit;
                    break;
                case 5:
                    d4 = digit;
                    break;
                case 6:
                    d3 = digit;
                case 7:
                    d2 = digit;
                    break;
                case 8:
                    d1 = digit;
                    break;
            }
            isbn /= 10;
        }

        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(d10 == 10) {
            result = "Your ISBN is: " + d1 + "-" + d2 + d3 + d4 + "-" + d5 + d6 + d7 + d8 + d9 + "-" + checksum;
        } else {
            result = "Your ISBN is: " + d1 + "-" + d2 + d3 + d4 + "-" + d5 + d6 + d7 + d8 + d9 + "-" + d10;
        }

        JOptionPane.showMessageDialog(null, result);
    }

}