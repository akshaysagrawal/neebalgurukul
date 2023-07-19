package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =0;
		
		while(x!=0)
		{
			s = (s * 10)+(x%10);
			x = x/10;
		}
		System.out.println("Reverse number: "+s);
	}

}
