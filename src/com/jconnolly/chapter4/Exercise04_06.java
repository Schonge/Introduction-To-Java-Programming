package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Conversion from miles to kilometers.
 */

public class Exercise04_06 {

    public static void main(String[] args) {
        int miles = 1;
        double kilometersConversion = 1.609;
        int kilometers = 20;
        String output = "Miles\tKilometers\tKilometers\tMiles";
        String conversion = "";

        while(miles <= 10) {
            conversion += "\n" + miles + "\t" + String.format("%.3f", miles * kilometersConversion)+ "\t" + kilometers + "\t"
            + String.format("%.3f", kilometers / kilometersConversion);
            miles++;
            kilometers += 5;
        }

        JTextArea textArea = new JTextArea(output + "\n" + conversion);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        JOptionPane.showMessageDialog(null, scrollPane, "Conversion: Miles to Kilometers", JOptionPane.YES_NO_OPTION);
    }

}