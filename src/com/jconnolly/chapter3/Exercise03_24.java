package com.jconnolly.chapter3;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Game: picking a card.
 */

public class Exercise03_24 {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomCardNum = rand.nextInt(52) + 1;

        String cardSuit = "";
        String cardValue = "";
        
        if(randomCardNum <= 13) {
            cardSuit = "Clubs";
        } else if(randomCardNum <= 26) {
            cardSuit = "Diamonds";
        } else if(randomCardNum <= 39) {
            cardSuit = "Hearts";
        } else {
            cardSuit = "Spades";
        }

        if(randomCardNum % 13 == 1) {
            cardValue = "Ace";
        } else if(randomCardNum % 13 == 11) {
            cardValue = "Jack";
        } else if(randomCardNum % 13 == 12) {
            cardValue = "Queen";
        } else if(randomCardNum % 13 == 0) {
            cardValue = "King";
        } else {
            cardValue = String.valueOf(randomCardNum % 13);
        }

        JOptionPane.showMessageDialog(null, "The card you picked is " + cardValue + " of " + cardSuit);
    }

}