package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Game: lottery.
 */

public class Exercise03_15 {

    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 900) + 100;

        String input = JOptionPane.showInputDialog(null, "Enter your lottery pick (three digits):",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int lotteryPick = Integer.parseInt(input);
        String message = "";

        // Lottery digits
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        // Lottery pick digits
        int pickDigit1 = lotteryPick / 100;
        int pickDigit2 = (lotteryPick / 10) % 10;
        int pickDigit3 = lotteryPick % 10;

        if(lottery == lotteryPick) {
            message = "The lottery number is " + lottery + "\nExact Match: You win $10,000";
        } else if((lotteryDigit1 == pickDigit2 || lotteryDigit1 == pickDigit3) &&
        (lotteryDigit2 == pickDigit1 || lotteryDigit2 == pickDigit3) &&
        (lotteryDigit3 == pickDigit1 || lotteryDigit3 == pickDigit2)) {
            message = "The lottery number is " + lottery + "\nMatched all numbers: You win $3,000";
        } else if(lotteryDigit1 == pickDigit1 || lotteryDigit1 == pickDigit2 || lotteryDigit1 == pickDigit3 || lotteryDigit2 == pickDigit2
        || lotteryDigit2 == pickDigit1 || lotteryDigit2 == pickDigit3 || lotteryDigit3 == pickDigit3) {
            message = "The lottery number is " + lottery + "\nMatched one number: You win $1,000";
        } else {
            message = "The lottery number is " + lottery + "\nSorry, no match";
        }

        JOptionPane.showMessageDialog(null, message);
    }

}