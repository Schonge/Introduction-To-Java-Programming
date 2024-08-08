package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Printing four patterns using loops.
 */

public class Exercise04_18 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter Pattern to display(1, 2, 3, or 4)):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int patternNumber = Integer.parseInt(input);
        String result = "";

        if(patternNumber < 1 || patternNumber > 4) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
        } else {
            if(patternNumber == 1) {
                result = "Pattern I\n";
                int x = 1;
                for(int i = 0; i < 6; i++) {
                    for(int j = 1; j <= x; j++) {
                        result += j + " ";
                    }
                    result += "\n";
                    x++;
                }
            } else if(patternNumber == 2) {
                result = "Pattern II\n";
                int x = 0;
                for(int i = 0; i < 6; i++) {
                    for(int j = 1; j < 7 - x; j++) {
                        result += j + " ";
                    }
                    result += "\n";
                    x++;
                }
            } else if(patternNumber == 3) {
                result = "Pattern III\n";
                for(int i = 1; i <= 6; i++) {
                    for(int j = 6 - i; j >= 1; j--) {
                        result += "   ";
                    }
                    for(int k = i; k >= 1; k--) {
                        result += " " + k;
                    }
                    result += "\n";
                }
            } else {
                result = "Pattern IV\n";
                for(int i = 0; i < 6; i++) {
                    for(int j = 0; j < i; j++) {
                        result += "   ";
                    }
                    for(int k = 1; k <= 6 - i; k++) {
                        result += k + " ";
                    }
                    result += "\n";
                }
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

}