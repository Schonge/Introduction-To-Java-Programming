package com.jconnolly.chapter4;

import java.text.DecimalFormat;

/**
 * Financial Application: Finding the sales amount.
 * @author jconnolly
 *
 */

public class Exercise4_39 {

	public static void main(String[] args) {
		
		final double BASE_SALARY = 5000.00;
		final double SALARY_TARGET = 30000.00;
		final double SALE_AMOUNT_MAX1 = 5000.00;
		final double SALE_AMOUNT_MAX2 = 10000.00;
		final double COMMISSION_RATE1 = 8.00;
		final double COMMISSION_RATE2 = 10.00;
		final double COMMISSION_RATE3 = 12.00;
		
		double commissionTarget = SALARY_TARGET - BASE_SALARY;
		
		double commission = 0.0;
		double salesAmount = 0.01;
		
		do {
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
			salesAmount += 0.01;
		} while(commission < commissionTarget);
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("To earn $" + df.format(SALARY_TARGET) + " a year, you must generate a minimum of $" +
				df.format(((int)(salesAmount * 100) / 100.0)) + " in sales.");
		
	}

}
