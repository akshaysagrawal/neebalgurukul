package com.gurukul.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q: Find if given number is prime?
		
//		int num;
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		boolean isPrime = true;
//		//to increase the efficiency of a program we write i<=Math.sqrt(num) in for loop
//		for(int i=2;i<=Math.sqrt(num);i++)
//		{
//			if(num%i==0) 
//			{
//				isPrime =false;
//				break;
//			}
//			
//		}
//		if(isPrime)
//			 System.out.println(num+" is a prime number");
//		else
//			System.out.println(num+" is not a prime number");
		
		
		
		//Q: Print prime numbers upto 1000
		
		for(int num = 2;num<=1000;num++)
		{
			boolean isPrime = true;
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0) 
				{
					isPrime =false;
					break;
				}				
			}
			if(isPrime)
				System.out.println(num);
		}
		
	}

}
