package com.jconnolly.chapter4;

import javax.swing.JOptionPane;

/*
 * Monte Carlo simulation.
 * 
 * Center of square is positioned at (0,0).
 * 
 * Top left and bottom right quadrant is Region 1.
 * Top right quadrant is split diagonally from the top left corner to the bottom right corner.
 * The top triangle is Region 2 and the bottom triangle is Region 3.
 * Bottom right quadrant is Region 4.
 */

public class Exercise04_44 {

    public static void main(String[] args) {
        final int NUMBER_OF_TRIALS = 1000000;
        int numOfOddHits = 0;
        String result = "";

        for(int i = 0; i < NUMBER_OF_TRIALS; i++) {
            double x = Math.random() * 2.0 - 1;
            double y = Math.random() * 2.0 - 1;
            // Check if dart falls in Region 1
            if(x < 0) {
                numOfOddHits += 1;
            // Check if dart falls in Region 3
            } else if(!(x > 1 || x < 0 || y > 1 || y < 0)) {
                double slope = (1.0 - 0) / (0 - 1.0);
                double x1 = x + -y * slope;
                if (x1 <= 1)
                numOfOddHits += 1;      
            }
        }

        result = "The probability in Region 1 and 3 is " + (1.0 * numOfOddHits / NUMBER_OF_TRIALS) + "\n" +
        "The darts hit the odd Regions " + numOfOddHits + " times.";
        JOptionPane.showMessageDialog(null, result);        
    }

}