package com.jconnolly.chapter4;

import javax.swing.*;
import java.awt.*;

/*
 * Finding the highest and lowest score.
 */

public class Exercise04_09 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the number of students:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int numberOfStudents = Integer.parseInt(input);
        int studentCounter = 1;
        double highestScore = 0, lowestScore = 100;
        String highestStudent = "", lowestStudent = "";
        String message = "";

        while(studentCounter <= numberOfStudents) {
            JTextField nameFiled = new JTextField(5);
            JTextField scoreField = new JTextField(5);

            JPanel myPanel = new JPanel();
            myPanel.setLayout(new GridLayout(0, 2));
            myPanel.add(new JLabel("Enter student name:"));
            myPanel.add(nameFiled);
            myPanel.add(new JLabel("Enter score:"));
            myPanel.add(scoreField);

            int studentInput = JOptionPane.showConfirmDialog(null, myPanel,
            "Student Exam Results", JOptionPane.OK_CANCEL_OPTION);
            if(studentInput == JOptionPane.OK_OPTION) {
                String studentName = nameFiled.getText();
                double studentScore = Double.parseDouble(scoreField.getText());

                if(studentScore >= highestScore) {
                    highestScore = studentScore;
                    highestStudent = studentName;
                } else if(studentScore <= lowestScore) {
                    lowestScore = studentScore;
                    lowestStudent = studentName;
                }
            }
            studentCounter++;
        }

        message = "The highest score is " + highestScore + " by " + highestStudent + "\nThe lowest score is " + lowestScore
            + " by " + lowestStudent;
        JOptionPane.showMessageDialog(null, message);
    }

}