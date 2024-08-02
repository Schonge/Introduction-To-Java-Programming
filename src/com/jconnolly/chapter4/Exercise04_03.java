package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Conversion from grams to ounces.
 */

public class Exercise04_03 {

    public static void main(String[] args) {
        int grams = 1;
        double ounces = 0.035;
        String output = "Grams\tOunces";
        String conversion = "";

        while(grams <= 199) {
            conversion += "\n" + grams + "\t" + String.format("%.3f", grams * ounces);
            grams = grams + 2;
        }

        JTextArea textArea = new JTextArea(output + "\n" + conversion);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(200, 500));

        JOptionPane.showMessageDialog(null, scrollPane, "Conversion: Grams to Ounces", JOptionPane.YES_NO_OPTION);
    }

}