package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_Largestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int s =0;
		int m;
		while(x!=0)
		{
			m= x%10;
			if(m>s)
			{
				s=m;
			}
			x=x/10;
		}
		System.out.println("Largest number: "+s);
	}

}
