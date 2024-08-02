package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Finding numbers divisible by 5 or 6 but not both.
 */

public class Exercise04_11 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int number = 100; number <= 200; number++) {
            if((number % 5 == 0 || number % 6 == 0) && !(number% 5 == 0 && number % 6 == 0)) {
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