package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/*
 * Game: scissor, rock, paper.
 */

public class Exercise03_17 {

    public static void main(String[] args) {
        int computerChoice = (int)(Math.random() * 3);

        String input = JOptionPane.showInputDialog(null, "Enter scissors(0), rock(1) or paper(2):",
        "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        int playerChoice = Integer.parseInt(input);
        String message = "", compChoice = "", playChoice = "";

        switch (computerChoice) {
            case 0:
                compChoice = "Scissors";
                break;
            case 1:
                compChoice = "Rock";
                break;
            case 2:
                compChoice = "Paper";
                break;
            default:
                break;
        }

        switch (playerChoice) {
            case 0:
                playChoice = "Scissors";
                break;
            case 1:
                playChoice = "Rock";
                break;
            case 2:
                playChoice = "Paper";
                break;
            default:
                break;
        }

        if(computerChoice == playerChoice) {
            message = "The computer is " + compChoice + ". You are " + playChoice + " too. It is a draw.";
        } else if((computerChoice == 0 && playerChoice == 2) || (computerChoice == 1 && playerChoice == 0)
        || (computerChoice == 2 && playerChoice == 1)) {
            message = "The computer is " + compChoice + ". You are " + playChoice + ". You lose!";
        } else {
            message = "The computer is " + compChoice + ". You are " + playChoice + ". You WIN!";
        }

        JOptionPane.showMessageDialog(null, message);
    }

}