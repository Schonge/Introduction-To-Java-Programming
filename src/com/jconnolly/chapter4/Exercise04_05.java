package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Conversion between grams and ounces.
 */

public class Exercise04_05 {

    public static void main(String[] args) {
        int grams = 1;
        double ouncesConversion = 0.035;
        int ounces = 5;
        String output = "Grams\tOunces\tOunces\tGrams";
        String conversion = "";

        while(grams <= 199) {
            conversion += "\n" + grams + "\t" + String.format("%.3f", grams * ouncesConversion) + "\t" + ounces + "\t"
            + String.format("%.3f", ounces / ouncesConversion);
            grams += 2;
            ounces += 5;
        }

        JTextArea textArea = new JTextArea(output + "\n" + conversion);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(400, 500));

        JOptionPane.showMessageDialog(null, scrollPane, "Conversion: Grams to Ounces", JOptionPane.YES_NO_OPTION);
    }

}