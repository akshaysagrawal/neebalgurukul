package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues3_Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		double x;
		double sum = 1;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		
		double f = 1;
		for(i=1;i<=10;i++)
		{
			f = f * i;
			sum = sum + Math.pow(x, i)/f;
		}
		System.out.println(sum);
		System.out.println(Math.exp(x));
	}

}
