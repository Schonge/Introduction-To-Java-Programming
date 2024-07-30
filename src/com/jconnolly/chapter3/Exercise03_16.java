package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Random character.
 */

public class Exercise03_16 {

    public static void main(String[] args) {
        // Random number representing each letter of the alphabet
        int  randNum = (int)(Math.random() * 26);
        // Convert the number to the letter
        char randChar = (char)('a' + randNum);

        JOptionPane.showMessageDialog(null, "The lowercase letter is " + randChar);
    }

}