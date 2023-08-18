package com.gurukul.day1;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		System.out.println("Enter the amount ");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		int twoThousand = amount/2000;
		//Finding remainder and storing it in amount because amount wont be needed in the future
		amount = amount%2000; 
		int fiveHundred = amount/500;
		amount = amount%500;
		int twoHundred = amount/200;
		amount = amount%200;
		int hundred = amount/100;
		amount = amount%100;
		int fifty = amount/50;
		amount = amount%50;
		int twenty = amount/20;
		amount = amount%20;
		int ten = amount/10;
		amount = amount%10;
		int five = amount/5;
		System.out.println("2000 * "+twoThousand+" = "+2000 * twoThousand );
		System.out.println("500 * "+fiveHundred+" = "+500 * fiveHundred );
		System.out.println("200 * "+twoHundred+" = "+200 * twoHundred );
		System.out.println("100 * "+hundred+" = "+100 * hundred);
		System.out.println("50 * "+fifty+" = "+50 * fifty );
		System.out.println("20 * "+twenty+" = "+20 * twenty );
		System.out.println("10 * "+ten+" = "+10 * ten );
		System.out.println("5 * "+five+" = "+5 * five );
		
	}

}
