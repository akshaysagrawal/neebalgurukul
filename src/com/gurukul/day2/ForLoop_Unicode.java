package com.gurukul.day2;

import java.util.Scanner;

public class ForLoop_Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upper,lower,unicode,i;
		System.out.println("Enter the upperbound value ");
		Scanner sc = new Scanner(System.in);
		upper = sc.nextInt();
		System.out.println("Enter the lowerbound value ");
		lower = sc.nextInt();
		
		for(i=lower;i<=upper;i++)
		{
			unicode = i;
			System.out.println((char)unicode+" - "+i);
		}
	}

}
