package com.jconnolly.chapter5;

import javax.swing.JOptionPane;

/*
 * Rolling multiple dice.
 */

public class Exercise05_29 {

    public static void main(String[] args) {
        String result = "";

        int die1 = rollDieOne();
        int die2 = rollDieTwo();
        int sum = die1 + die2;
        int point = 0;

        if(sum == 2 || sum == 3 || sum == 12) {
            result += "You rolled a " + die1 + " + " + die2 + " = " + sum + "\n";
            result += "Craps! You lose!";
        } else if(sum == 7 || sum == 11) {
            result += "You rolled a " + die1 + " + " + die2 + " = " + sum + "\n";
            result += "Natural! You Win!";
        } else {
            point = sum;
            result += "You rolled a " + die1 + " + " + die2 + " = " + sum + "\n";
            result += "Point is " + point + "\n";
            JOptionPane.showMessageDialog(null, result);
            while(sum != 7) {
                int roll1 = rollDieOne(), roll2 = rollDieTwo();
                sum = roll1 + roll2;
                if(sum == point) {
                    result = "You rolled a " + roll1 + " + " + roll2 + " = " + sum + "\n";
                    result += " You Win!\n";
                    JOptionPane.showMessageDialog(null, result);
                } else if(sum == 7) {
                    result += "You rolled a " + roll1 + " + " + roll2 + " = " + sum + "\n";
                    result += "You lose!\n";
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
/*
 * Seems like this exercise has been structured incorrectly in how it has been asked
 * to be completed. I will complete it differently to how it has been described in order
 * to get the desired results.
 */
    public static int rollDieOne() {
        return (int)(Math.random() * 6) + 1;
    }

    public static int rollDieTwo() {
        return (int)(Math.random() * 6) + 1;
    }

}