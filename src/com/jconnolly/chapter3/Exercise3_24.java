package com.jconnolly.chapter3;

/**
 * Game: Picking a card.
 * @author jconnolly
 *
 */

public class Exercise3_24 {

	public static void main(String[] args) {
		int card = (int)(Math.random() * 14 + 1);
		int suit = (int)(Math.random() * 5 + 1);
		
		String suitName = "";
		
		if(suit == 1) {
			suitName = "Clubs";
		} else if(suit == 2) {
			suitName = "Diamonds";
		} else if(suit == 3) {
			suitName = "Hearts";
		} else {
			suitName = "Spades";
		}
		
		switch(card) {
			case 1:
				System.out.println("The card you picked is the Ace of " + suitName);
				break;
			case 2:
				System.out.println("The card you picked is the 2 of " + suitName);
				break;
			case 3:
				System.out.println("The card you picked is the 3 of " + suitName);
				break;
			case 4:
				System.out.println("The card you picked is the 4 of " + suitName);
				break;
			case 5:
				System.out.println("The card you picked is the 5 of " + suitName);
				break;
			case 6:
				System.out.println("The card you picked is the 6 of " + suitName);
				break;
			case 7:
				System.out.println("The card you picked is the 7 of " + suitName);
				break;
			case 8:
				System.out.println("The card you picked is the 8 of " + suitName);
				break;
			case 9:
				System.out.println("The card you picked is the 9 of " + suitName);
				break;
			case 10:
				System.out.println("The card you picked is the 10 of " + suitName);
				break;
			case 11:
				System.out.println("The card you picked is the Jack of " + suitName);
				break;
			case 12:
				System.out.println("The card you picked is the Queen of " + suitName);
				break;
			case 13:
				System.out.println("The card you picked is the King of " + suitName);
				break;
			default:
				break;
		}

	}

}
