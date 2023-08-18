package com.gurukul.day2;

import java.util.Scanner;

public class BitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,bitnum;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Enter the bit number ");
		bitnum = sc.nextInt();
		
		//right shift bit-1 times so that the desired bit comes to end and then & it with 1 to get it out.
		int coressBit = (num >> (bitnum-1)) & 1;
		
		System.out.println("The corresponding bit is "+coressBit);
	}

}
