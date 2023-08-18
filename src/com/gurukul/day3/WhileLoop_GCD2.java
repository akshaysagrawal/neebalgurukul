package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_GCD2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 1st number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		int mod;
		while(x%y!=0)
		{
			mod = x%y;
			x=y;
			y=mod;
		}
		System.out.println("GCD = "+y);
		
	}

}
