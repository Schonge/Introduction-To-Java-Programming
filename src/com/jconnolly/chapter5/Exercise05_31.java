package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Financial: credit card number validation.
 */

public class Exercise05_31 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a credit card number for validation:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        long ccNumber = Long.parseLong(input);

        String result = "";

        if(isValid(ccNumber)) {
            result += ccNumber + " is VALID!";
        } else {
            result += ccNumber + " is INVALID!";
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatching(number, 4)
         || prefixMatching(number, 5) || prefixMatching(number, 37) || prefixMatching(number, 6))
         && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 9) {
            return number;
        }
        return (number / 10) + (number % 10);
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    public static boolean prefixMatching(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        int ccLength = String.valueOf(d).length();
        return ccLength;
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }

}