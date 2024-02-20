package com.jconnolly.chapter2.exercises;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Random character.
 */

public class Exercise02_19 {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        
        Random random = new Random(currentTime);
        char randomUppercaseLetter = (char)(random.nextInt(26) + 'A');

        String output = "The random uppercase letter is " + randomUppercaseLetter;
        JOptionPane.showMessageDialog(null, output);
    }
    
}