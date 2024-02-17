package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Printing a table.
 */

public class Exercise02_18 {

    public static void main(String[] args) {
        final int ZERO = 0;
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;
        final int FIVE = 5;

        String output = "a    b    a%b\n" +
        ZERO + "    " + TWO + "    " + ZERO%TWO + "\n" +
        ONE + "    " + TWO + "    " + ONE%TWO + "\n" +
        TWO + "    " + TWO + "    " + TWO%TWO + "\n" +
        THREE + "    " + THREE + "    " + THREE%THREE + "\n" +
        FOUR + "    " + THREE + "    " + FOUR%THREE + "\n" +
        FIVE + "    " + THREE + "    " + FIVE%THREE;
        JOptionPane.showMessageDialog(null, output);
    }
    
}