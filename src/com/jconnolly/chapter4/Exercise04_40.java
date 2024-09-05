package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Simulation: rolling a die.
 */

public class Exercise04_40 {

    public static void main(String[] args) {
        String result = "";
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        for(int i = 1; i <= 1000000; i++) {
            int dieRoll = (int)((Math.random() * 6) + 1);
            switch(dieRoll) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
            }
        }
        result = "The die rolled a 1 " + count1 + " times.\n" +
        "The die rolled a 2 " + count2 + " times.\n" +
        "The die rolled a 3 " + count3 + " times.\n" +
        "The die rolled a 4 " + count4 + " times.\n" +
        "The die rolled a 5 " + count5 + " times.\n" +
        "The die rolled a 6 " + count6 + " times.\n";

        JOptionPane.showMessageDialog(null, result);
    }

}