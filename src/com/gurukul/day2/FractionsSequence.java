package com.gurukul.day2;

import java.util.Scanner;

public class FractionsSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		double n;
		double sum = 0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();
		
		// Question 1
		for(i=1;i<=n;i++)
		{
			sum = sum + 1/i;
		}
		System.out.println(sum);
		
		
		//Question 2
		sum = 0; 
		for(i=1;i<=n;i++)
		{
			sum = sum + 1/Math.pow(i,2);
		}
		System.out.println(sum);
		
		
		//Question 3
		sum = 0;
		double f = 1;
		for(i=1;i<=n;i++)
		{
			f = f * i;
			sum = sum + 1/f;
		}
		System.out.println(sum);
		
		
		//Question 4
		sum = 0;
		f = 1;
		double num = 1;
		for(i=1;i<20;i++)
		{
			f = f*i;
			if(i%2 !=0)
			{
				sum = sum + num/f;
				num = -num;
			}
		}
		System.out.println(sum);
		
		
		//Question 5
		sum = 0;
		f = 1;
		System.out.println("Enter x in degree ");
		double x = sc.nextDouble();
		x = Math.toRadians(x);
		num = x;
		for(i=1;i<20;i++)
		{
			f = f*i;
			if(i%2 !=0)
			{
				sum = sum + num/f;
				num = -num*x*x;
			}
		}
		System.out.println(sum);
		System.out.println(Math.sin(x));
	}

}
