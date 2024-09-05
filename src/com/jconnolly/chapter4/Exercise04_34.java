package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Game: scissor, rock, paper.
 */

public class Exercise04_34 {

    public static void main(String[] args) {
        int computerWins = 0;
        int playerWins = 0;

        String result = "";

        while(computerWins < 3 && playerWins < 3) {
            int computerChoice = (int)(Math.random() * 3);

            String input = JOptionPane.showInputDialog(null, "Enter scissors(0), rock(1) or paper(2):",
            "Rock, Paper, Scissors", JOptionPane.QUESTION_MESSAGE);
        
            int playerChoice = Integer.parseInt(input);
            String compChoice = "", playChoice = "";

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
                result = "The computer is " + compChoice + ". You are " + playChoice + " too. It is a draw.";
            } else if((computerChoice == 0 && playerChoice == 2) || (computerChoice == 1 && playerChoice == 0)
            || (computerChoice == 2 && playerChoice == 1)) {
                result = "The computer is " + compChoice + ". You are " + playChoice + ". You lose!";
                computerWins++;
                playerWins = 0;
            } else {
                result = "The computer is " + compChoice + ". You are " + playChoice + ". You WIN!";
                playerWins++;
                computerWins = 0;
            }

            JOptionPane.showMessageDialog(null, result);
        }
        if (playerWins == 3) {
            result = "Congratulations! You won three times in a row.";
        } else {
            result = "Computer won three times in a row. Better luck next time!";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}