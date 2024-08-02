package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Using the &&, || and ^ operators.
 */

public class Exercise03_26 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int number = Integer.parseInt(input);

        String result = "";

        result = "Is " + number  + " even and a pefect square? " + (number % 2 == 0 && (number % Math.sqrt(number) == 0)) +
        "\nIs " + number + " even or a perfect square? " + (number % 2 == 0 || (number % Math.sqrt(number) == 0)) +
        "\nIs " + number + " even or a perfect square, but not both? " + (number % 2 == 0 ^ (number % Math.sqrt(number) == 0));

        JOptionPane.showMessageDialog(null, result);
    }

}