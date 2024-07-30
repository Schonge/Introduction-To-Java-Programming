package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Financial application: monetary units.
 */

public class Exercise03_07 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an amount in double, for example 11.56:",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        double inputAmount = Double.parseDouble(input);
        int amount = (int)(inputAmount * 100); 

        int numberOfDollars = amount / 100;
        int remaining = amount % 100;
        int numberOfQuarters = remaining / 25;
        remaining = remaining % 25;
        int numberOfDimes = remaining / 10;
        remaining = remaining % 10;
        int numberOfNickels = remaining / 5;
        remaining = remaining % 5;
        int numberOfPennies = remaining;

        String dollarsMsg = "", quartersMsg = "", dimesMsg = "", nickelsMsg = "", penniesMsg = "";
        if(numberOfDollars > 0) {
            if(numberOfDollars > 1) {
                dollarsMsg = numberOfDollars + " dollars\n";
            } else {
                dollarsMsg = numberOfDollars + " dollar\n";
            }
        }
        if(numberOfQuarters > 0) {
            if(numberOfQuarters > 1) {
                quartersMsg = numberOfQuarters + " quarters\n";
            } else {
                quartersMsg = numberOfQuarters + " quarter\n";
            }
        }
        if(numberOfDimes > 0) {
            if(numberOfDimes > 1) {
                dimesMsg = numberOfDimes + " dimes\n";
            } else {
                dimesMsg = numberOfDimes + " dime\n";
            }
        }
        if(numberOfNickels > 0) {
            if(numberOfNickels > 1) {
                nickelsMsg = numberOfNickels + " nickels\n";
            } else {
                nickelsMsg = numberOfNickels + " nickel\n";
            }
        }
        if(numberOfPennies > 0) {
            if(numberOfPennies > 1) {
                penniesMsg = numberOfPennies + " pennies\n";
            } else {
                penniesMsg = numberOfPennies + " penny\n";
            }
        }

        String output = "Your amount " + inputAmount + " consists of\n" + dollarsMsg + quartersMsg + dimesMsg + nickelsMsg + penniesMsg;
        JOptionPane.showMessageDialog(null, output);
    }
    
}