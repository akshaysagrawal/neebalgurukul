package com.gurukul.day3;

import java.util.Scanner;

public class WhileLoop_SumOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 	//Initialization
		int sum =0;
		while(x!=0)		//Condition
		{
			int mod = x % 10;
			x=x/10;	 	//Updation
			sum = sum + mod;
		}
		System.out.println("Sum = "+sum);
	}

}
