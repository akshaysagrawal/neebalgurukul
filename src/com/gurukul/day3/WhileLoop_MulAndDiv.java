package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_MulAndDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter 2nd number");
		int y = sc.nextInt();
		int sum =0;
		while(x!=0)
		{
			if(x%2!=0)
			{
				sum = sum + y;
			}
			//y=Math.multiplyExact(2, y);
			//x=Math.divideExact(x, 2);
			
			y=y<<1;
			x=x>>1;
		}
		System.out.println(sum);
		
	}

}
