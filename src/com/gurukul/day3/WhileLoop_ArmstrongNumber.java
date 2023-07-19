package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = x;
		int y =x;
		int count = 0;
		double m = 0;
		while(x!=0)
		{
			count++;
			x=x/10;
		}
		while(z!=0)
		{
			int a = z%10;
			m = m + Math.pow(a, count);
			z=z/10;
		}
		if(m==y)
		{
			System.out.println(y+" is an armstrong number");
		}
		else
			System.out.println(y+" is not an armstrong number");
	}

}
