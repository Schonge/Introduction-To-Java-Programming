package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Generating random characters.
 */

public class Exercise05_23 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int i = 1; i <= 50; i++) {
            result += getRandomLowercaseLetter() + " ";
            perLineCounter++;

            if(perLineCounter % 5 == 0) {
                result += "\n";
            }
        }

        for(int j = 1; j <= 50; j++) {
            result += getRandomDigitCharacter() + " ";
            perLineCounter++;

            if(perLineCounter % 5 == 0) {
                result += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowercaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

}