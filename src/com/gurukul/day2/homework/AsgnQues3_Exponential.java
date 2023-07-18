package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues3_Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		double x;
		double sum = 0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		double num=x;
		double f = 1;
		for(i=1;i<=10;i++)
		{
			f = f * i;
			sum = sum + Math.pow(num, i)/f;
		}
		sum = 1+ sum;
		System.out.println(sum);
		System.out.println(Math.exp(x));
	}

}
