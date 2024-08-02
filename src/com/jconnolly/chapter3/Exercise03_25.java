package com.jconnolly.chapter3;

import javax.swing.*;
import java.awt.*;

/*
 * Converting from military time.
 */

public class Exercise03_25 {

    public static void main(String[] args) {
        JTextField hourField = new JTextField(5);
        JTextField minuteField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(0, 2));
        myPanel.add(new JLabel("Enter hour(24-Hour):"));
        myPanel.add(hourField);
        myPanel.add(new JLabel("Enter minute:"));
        myPanel.add(minuteField);

        int input = JOptionPane.showConfirmDialog(null, myPanel,
        "Check if Point is in Triangle", JOptionPane.OK_CANCEL_OPTION);

        String message = "";

        if(input == JOptionPane.OK_OPTION) {
            int hour = Integer.parseInt(hourField.getText());
            int minute = Integer.parseInt(minuteField.getText());

            if(hour >= 0 && hour <= 24 && minute >= 0 && minute <= 59) {
                if((hour >= 0 && hour < 12) || hour == 24) {
                    if(hour == 0 || hour == 24) {
                        hour = 12;
                    }
                    message = "The standard time is " + hour + ":" + minute + "AM.";
                } else {
                    switch (hour) {
                        case 13:
                            hour = 1;
                            break;
                    
                        case 14:
                            hour = 2;
                            break;

                        case 15:
                            hour = 3;
                            break;
                    
                        case 16:
                            hour = 4;
                            break;

                        case 17:
                            hour = 5;
                            break;
                    
                        case 18:
                            hour = 6;
                            break;

                        case 19:
                            hour = 7;
                            break;
                    
                        case 20:
                            hour = 8;
                            break;

                        case 21:
                            hour = 9;
                            break;
                    
                        case 22:
                            hour = 10;
                            break;

                        case 23:
                            hour = 11;
                            break;
                    }
                    message = "The standard time is " + hour + ":" + minute + "PM.";
                }
            } else {
                message = "Invalid input.";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    }

}