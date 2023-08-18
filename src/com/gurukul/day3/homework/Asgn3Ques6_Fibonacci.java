package com.gurukul.day3.homework;

import java.util.Scanner;

public class Asgn3Ques6_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the value of start ");
		int start = sc.nextInt();
		int first = 0;
		int second = 1;
		int fib;
		int count=0;
		for(int i=1;;i++)
		{
		
			fib = first + second;
			first = second;
			second = fib;
			if(fib>= start)
			{
				System.out.print(fib+" ");
				count++;
			}
			if(count==n)
			{
				break;
			}
			
		}
	}

}
