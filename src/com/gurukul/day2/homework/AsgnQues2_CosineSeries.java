package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues2_CosineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x in degree ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		x = Math.toRadians(x);
		double num = x;
		double i;
		double sum = 0;
		double f = 1;
		for(i=1;i<20;i++)
		{
			f = f*i;

			if(i%2==0)
			{
				sum = sum + num/f;
				num = -num*x*x;
			}
		}
		System.out.println(sum);
		System.out.println(Math.cos(x));
	}

}
