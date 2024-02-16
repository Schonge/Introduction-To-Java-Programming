package com.jconnolly.chapter2;

import javax.swing.JOptionPane;

/*
 * Converting a lowercase letter to uppercase.
 */

public class Exercise02_07 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a lowercase letter:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        char lowercase = input.charAt(0);

        int offset = 'a' - (int)'A';
        int unicodeForLowecase = (int)lowercase;
        int unicodeForUppercase = unicodeForLowecase - offset;
        char uppercase = (char)unicodeForUppercase;

        String output = "The lowercase letter is " + lowercase + ".\nThe uppercase letter is " + uppercase + ".";
        JOptionPane.showMessageDialog(null, output);
    }
    
}