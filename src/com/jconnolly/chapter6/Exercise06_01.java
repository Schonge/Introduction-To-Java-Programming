package com.jconnolly.chapter6;

import javax.swing.JOptionPane;

/*
 * Assigning grades.
 */

public class Exercise06_01 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the number of students:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        
        int numStudents = Integer.parseInt(input);

        double[] grades = new double[numStudents];

        for(int i = 0; i < numStudents; i++) {
            String gradeInput = JOptionPane.showInputDialog(null, "Enter the student's grade:",
            "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            grades[i] = Double.parseDouble(gradeInput);
        }

        String message = displayGrades(grades) + "\n" + displayScores(grades);

        JOptionPane.showMessageDialog(null, message);
    }

    public static String displayGrades(double[] grades) {
        String results = "";
        String grade = "";

        for(int i = 0; i < grades.length; i++) {
            if(grades[i] >= 90) {
                grade = "A";
            } else if(grades[i] >= 80) {
                grade = "B";
            } else if(grades[i] >= 70) {
                grade = "C";
            } else if(grades[i] >= 60){
                grade = "D";
            } else {
                grade = "F";
            }
            results += "Student " + (i+1) + "'s score is " + grades[i] + " and grade is " + grade + ".\n";
        }

        return results;
    }

    public static String displayScores(double[] grades) {
        double highScore = 0;
        double lowScore = 100;
        double totalScore = 0;
        double averageScore = 0;
        String results = "";

        for(int i = 0; i < grades.length; i++) {
            if(highScore <= grades[i]) {
                highScore = grades[i];
            }
            if(lowScore >= grades[i]) {
                lowScore = grades[i];
            }
            totalScore += grades[i];
        }

        averageScore = totalScore / grades.length;
        results += "The highest score is " + highScore + ".\n" +
            "The lowest score is " + lowScore + ".\n" +
            "The average score is " + averageScore + ".\n";

        return results;
    }

}