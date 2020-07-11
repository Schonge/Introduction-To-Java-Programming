package com.jconnolly.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Financial Application: Finding the sales amount.
 * @author jconnolly
 *
 */

public class Exercise4_42 {

	public static void main(String[] args) {
		
		final double SALE_AMOUNT_MAX1 = 5000.00;
		final double SALE_AMOUNT_MAX2 = 10000.00;
		final double COMMISSION_RATE1 = 8.00;
		final double COMMISSION_RATE2 = 10.00;
		final double COMMISSION_RATE3 = 12.00;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("What is your commission sought target?: ");
		double commissionSought = input.nextDouble();
		
		double commission = 0.0;
		double salesAmount;
		for(salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
			// Compute Commission
			if(salesAmount > SALE_AMOUNT_MAX2) {
				commission = (SALE_AMOUNT_MAX1 * (COMMISSION_RATE1 / 100.0)) + 
						(SALE_AMOUNT_MAX1 * (COMMISSION_RATE2 / 100.0)) +
						((salesAmount - SALE_AMOUNT_MAX2) * (COMMISSION_RATE3 / 100.0));
			} else if(salesAmount > SALE_AMOUNT_MAX1) {
				commission = (SALE_AMOUNT_MAX1 * (COMMISSION_RATE1 / 100.0)) + 
						(SALE_AMOUNT_MAX1 * (COMMISSION_RATE2 / 100.0));
			} else {
				commission = (SALE_AMOUNT_MAX1 * (COMMISSION_RATE1 / 100.0));
			}
		}
		
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("The sales amount of $" + df.format(((int)(salesAmount * 100) / 100.0)) +
				" is needed to make a commission of $" + df.format(commissionSought) + ".");
	}

}
