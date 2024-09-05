package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Displaying leap years.
 */

public class Exercise04_27 {

    public static void main(String[] args) {
        int startYear = 1801;
        int endYear = 1900;
        int count = 0;
        String output = "";

        for(int i = startYear; i <= endYear; i++) {
            if((i % 4 ==0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
                if(count % 10 == 0) {
                    output += i + "\n";
                } else {
                    output += i + " ";
                }                
            } 
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

}