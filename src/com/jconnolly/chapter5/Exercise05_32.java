package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Rolling multiple dice: frquencies of outcomes.
 */

public class Exercise05_32 {

    public static void main(String[] args) {
        int die1 =0, die2 =0, sum = 0;
        int countTwo = 0, countThree = 0, countFour = 0, countFive = 0, countSix = 0, countSeven = 0,
        countEight = 0, countNine = 0, countTen = 0, countEleven = 0, countTwelve = 0;

        for(int i = 1; i <= 10000; i++) {
            die1 = rollDieOne();
            die2 = rollDieTwo();
            sum = die1 + die2;

            switch (sum) {
                case 2:
                    countTwo++;
                break;
                case 3:
                    countThree++;
                break;
                case 4:
                    countFour++;
                break;
                case 5:
                    countFive++;
                break;
                case 6:
                    countSix++;
                break;
                case 7:
                    countSeven++;
                break;
                case 8:
                    countEight++;
                break;
                case 9:
                    countNine++;
                break;
                case 10:
                    countTen++;
                break;
                case 11:
                    countEleven++;
                break;
                case 12:
                    countTwelve++;
                break;
            }
        }

        String message = "2 was rolled + " + getPercentage(countTwo) + "% of the time.\n" +
            "3 was rolled + " + getPercentage(countThree) + "% of the time.\n" +
            "4 was rolled + " + getPercentage(countFour) + "% of the time.\n" +
            "5 was rolled + " + getPercentage(countFive) + "% of the time.\n" +
            "6 was rolled + " + getPercentage(countSix) + "% of the time.\n" +
            "7 was rolled + " + getPercentage(countSeven) + "% of the time.\n" +
            "8 was rolled + " + getPercentage(countEight) + "% of the time.\n" +
            "9 was rolled + " + getPercentage(countNine) + "% of the time.\n" +
            "10 was rolled + " + getPercentage(countTen) + "% of the time.\n" +
            "11 was rolled + " + getPercentage(countEleven) + "% of the time.\n" +
            "12 was rolled + " + getPercentage(countTwelve) + "% of the time.\n";
        
        JOptionPane.showMessageDialog(null, message);
    }

    public static int rollDieOne() {
        return (int)(Math.random() * 6) + 1;
    }

    public static int rollDieTwo() {
        return (int)(Math.random() * 6) + 1;
    }

    public static double getPercentage(int count) {
        double percentage = (count / 10000.0) * 100;
        return percentage;
    }

}