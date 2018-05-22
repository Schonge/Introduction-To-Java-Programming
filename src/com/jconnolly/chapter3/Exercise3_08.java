package com.jconnolly.chapter3;

import javax.swing.JOptionPane;

/**
 * Sorting three integers.
 * @author jconnolly
 *
 */

public class Exercise3_08 {
	
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Enter an integer:", "Integer 1", 1);
		double num1 = Double.parseDouble(num1String);
		String num2String = JOptionPane.showInputDialog(null, "Enter an integer:", "Integer 2", 1);
		double num2 = Double.parseDouble(num2String);
		String num3String = JOptionPane.showInputDialog(null, "Enter an integer:", "Integer 3", 1);
		double num3 = Double.parseDouble(num3String);
		
		String output = "";
		if(num1 >= num2 && num1 >= num3 && num2 >= num3) {
			output = num1 + " >= " + num2 + " >= " + num3;
		}
		if(num2 >= num1 && num2 >= num3 && num1 >= num3) {
			output = num2 + " >= " + num1 + " >= " + num3;
		}
		if(num3 >= num1 && num3 >= num2 && num1 >= num2) {
			output = num3 + " >= " + num1 + " >= " + num2;
		}
		if(num1 >= num2 && num1 >= num3 && num3 >= num2) {
			output = num1 + " >= " + num3 + " >= " + num2;
		}
		if(num2 >= num1 && num2 >= num3 && num3 >= num1) {
			output = num2 + " >= " + num3 + " >= " + num1;
		}
		if(num3 >= num1 && num3 >= num2 && num2 >= num1) {
			output = num3 + " >= " + num2 + " >= " + num1;
		}
		
		JOptionPane.showMessageDialog(null, output);
	}

}
