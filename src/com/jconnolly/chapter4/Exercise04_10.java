package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Finding numbers divisible by 5 and 6.
 */

public class Exercise04_10 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int number = 100; number <= 1000; number++) {
            if(number % 5 == 0 && number % 6 == 0) {
                result += number + " ";
                perLineCounter++;

                if(perLineCounter % 10 == 0) {
                    result += "\n";
                }
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}