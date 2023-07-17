package com.gurukul.day1;

import java.util.Scanner;

public class AsgnQues5_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.println("Enter second number ");
		double num2 = sc.nextDouble();
		System.out.println("Enter third number ");
		double num3 = sc.nextDouble();
		
		double temp = 0;
		if(num1>num2)
		{
			temp=num1;
		}
		else
		{
			temp= num2;
		}
		if(num3>temp)
		{
			temp=num3;
		}
		System.out.println("The largest number is "+temp);
	}

}
