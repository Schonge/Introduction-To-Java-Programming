package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Math: combinations.
 */

public class Exercise04_45 {

    public static void main(String[] args) {
        String result = "";

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i != j) {
                    result += i + " " + j + "\n";
                }
            }
        }
        
        JTextArea textArea = new JTextArea(result);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(50, 100));

        JOptionPane.showMessageDialog(null, scrollPane, "Math: Combinations", JOptionPane.YES_NO_OPTION);
    }

}