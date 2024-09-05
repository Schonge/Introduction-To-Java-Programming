package com.jconnolly.chapter4;

import java.util.Scanner;

/*
 * Simulation: clock countdown.
 */

public class Exercise04_43 {

    public static void main(String[] args) throws InterruptedException {
        /*
         * I abandoned using JOptionPane for this exercise as it was not fit for purpose
         * in order to display the countdown timer effectively
         */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        for(int i = seconds; i > 0; i--) {
            System.out.println(i + " seconds remaining");

            Thread.sleep(1000);
        }

        System.out.println("Stopped");

        Thread.sleep(2000);
        scanner.close();
    }

}