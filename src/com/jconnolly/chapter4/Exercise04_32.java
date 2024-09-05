package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Game: lottery.
 */

public class Exercise04_32 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter your lottery pick (two digits):",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int guess = Integer.parseInt(input);
        String result = "";

        int lottery, lotteryDigit1, lotteryDigit2;

        do {
            lottery = (int)(Math.random() * 100);

            lotteryDigit1 = lottery / 10;
            lotteryDigit2 = lottery % 10;
        } while(lotteryDigit1 == lotteryDigit2);
        
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        result += "The lottery number is " + lottery + "\n";

        if(guess == lottery) {
            result += "Exact match: you win $10,000";
        } else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            result += "Match all digits: you win $3,000";
        } else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
        || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            result += "Match one digit: you win $1,000";
        } else {
            result += "Sorry, no match";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}