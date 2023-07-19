package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GCD = Greatest Common Divisor
		
		System.out.println("Enter 1st number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		
		while(x!=y)
		{
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		System.out.println("GCD = "+x);
	}

}
