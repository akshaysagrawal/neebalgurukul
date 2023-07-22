package com.gurukul.day6;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x[] = new double [n];
		
		for(int i = 0;i<x.length;i++)
		{
			System.out.println("Enter the value in the array");
			x[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0;i<x.length;i++)
		{
			sum = sum +x[i];
		}
		System.out.println("sum of array: "+sum);
		
		double avg = sum/x.length;
		System.out.println("sum of array: "+avg);
		
		double var = 0.0;
		for(int i = 0;i<x.length;i++)
		{
			double v = ((x[i]-avg) * (x[i]-avg));
			var =var + v;
		}
		var/=n;
		System.out.println("variance : "+var);
		
		Double sd = Math.sqrt(var);
		
		System.out.println("Standard deviation : "+sd);
	}

}
