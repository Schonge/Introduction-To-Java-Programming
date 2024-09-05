package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Decimal to hex.
 */

public class Exercise04_38 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an integer:",
        "Decimal to Hexadecimal", JOptionPane.QUESTION_MESSAGE);

        int decimal = Integer.parseInt(input);
        StringBuilder hexadecimal = new StringBuilder();

        // Convert to hexadecimal
        while(decimal > 0) {
            int remainder = decimal % 16;
            if(remainder >= 10 && remainder <= 15) {
                switch (remainder) {
                    case 10:
                        hexadecimal.append("A");
                        break;
                    case 11:
                        hexadecimal.append("B");
                        break;
                    case 12:
                        hexadecimal.append("C");
                        break;
                    case 13:
                        hexadecimal.append("D");
                        break;
                    case 14:
                        hexadecimal.append("E");
                        break;
                    case 15:
                        hexadecimal.append("F");
                        break;
                }
            } else {
                hexadecimal.append(remainder);
            }
            decimal /= 16;
        }

        // Need to reverse the hexadecimal
        JOptionPane.showMessageDialog(null, hexadecimal.reverse().toString());
    }

}