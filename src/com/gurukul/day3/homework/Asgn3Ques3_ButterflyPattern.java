package com.gurukul.day3.homework;

public class Asgn3Ques3_ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=10-2*i;j>=1;j--)		
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
		
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=10-2*i;j>=1;j--)		
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
	}

}
