package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Math: triangular numbers.
 */

public class Exercise05_01 {

    public static void main(String[] args) {
        String result = "";
        int perLineCounter = 0;

        for(int i = 1; i <= 100; i++) {
            result += " " + getTriangularNumbers(i);
            perLineCounter++;
            
            if(perLineCounter % 10 == 0) {
                result += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static int getTriangularNumbers(int n) {
        int triangularNumber = 0;
        for(int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        return triangularNumber;
    }

}