package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Conversions between inches and centimeters.
 */

public class Exercise05_09 {

    public static void main(String[] args) {
        String result = "Inches        Centimeters      Centimeters      Inches\n";

        double inches = 1;
        double centimeters = 5;

        for (int i = 1; i <= 10; inches++, centimeters += 5, i++) {
            result += inches + "               " + String.format("%.2f", inchToCentimeter(inches)) + "                 " 
            + centimeters + "                 " + String.format("%.2f", centimeterToInch(centimeters)) + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static double inchToCentimeter(double in) {
        return in * 2.54;
    }

    public static double centimeterToInch(double cm) {
        return cm / 2.54;
    }

}