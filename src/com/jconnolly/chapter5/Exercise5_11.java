package com.jconnolly.chapter5;

/**
 * Financial Application: Computing commissions.
 * @author jconnolly
 *
 */

public class Exercise5_11 {

	public static void main(String[] args) {
		
		final double MIN_SALES = 10000.00;
		final double MAX_SALES = 100000.00;
		final double CHANGE_AMOUNT = 5000.00;
		
		System.out.println("Sales AMount\tCommission");
		
		for (double salesAmount = MIN_SALES; salesAmount <= MAX_SALES; salesAmount += CHANGE_AMOUNT) {
			System.out.printf("%-6.0f\t\t%-7.1f\n", salesAmount, computeCommission(salesAmount));
		}
		
		System.out.println();
		
	}
	
	public static double computeCommission(double salesAmount) {
		final double SALE_AMOUNT_MAX1 = 5000.00;
		final double SALE_AMOUNT_MAX2 = 10000.00;
		final double COMMISSION_RATE1 = 8.00;
		final double COMMISSION_RATE2 = 10.00;
		final double COMMISSION_RATE3 = 12.00;
		
		if (salesAmount > SALE_AMOUNT_MAX2) {
    		return (SALE_AMOUNT_MAX1 * (COMMISSION_RATE1 / 100.0)) + 
    				(SALE_AMOUNT_MAX1 * (COMMISSION_RATE2 / 100.0)) + 
    				((salesAmount - SALE_AMOUNT_MAX2) * (COMMISSION_RATE3 / 100.0));
    	} else if (salesAmount > SALE_AMOUNT_MAX1) {
    		return (SALE_AMOUNT_MAX1 * (COMMISSION_RATE1 / 100.0)) + 
    				((salesAmount - SALE_AMOUNT_MAX1) * (COMMISSION_RATE2 / 100.0));
    	} else {
    		return salesAmount * (COMMISSION_RATE1 / 100.0);
    	}
	}

}
