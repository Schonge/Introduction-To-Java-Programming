package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Conversion from miles to kilometers
 */

public class Exercise04_04 {

    public static void main(String[] args) {
        int miles = 1;
        double kilometers = 1.609;
        String output = "Miles\tKilometers";
        String conversion = "";

        while(miles <= 10) {
            conversion += "\n" + miles + "\t" + String.format("%.3f", miles * kilometers);
            miles++;
        }

        JTextArea textArea = new JTextArea(output + "\n" + conversion);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(200, 200));

        JOptionPane.showMessageDialog(null, scrollPane, "Conversion: Miles to Kilometers", JOptionPane.YES_NO_OPTION);
    }

}