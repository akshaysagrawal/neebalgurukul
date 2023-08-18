package com.gurukul.day1;

import java.util.Scanner;

public class DivideTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		System.out.println("Enter first number ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		System.out.println("Enter second number ");
		double num2 = sc.nextDouble();
		if(num1>num2)
		{
			 result = num1/num2;
		}
		else
		{
			 result = num2/num1;
		}
		System.out.println("The result is "+result);
	}

}
