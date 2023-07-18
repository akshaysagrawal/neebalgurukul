package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues6_FibonacciInBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the upperbound");
		Scanner sc = new Scanner(System.in);
		int upper = sc.nextInt();
		System.out.println("Enter the lowerbound ");
		int lower = sc.nextInt();
		int f = 0;
		int s = 1;
		int fib;
		for(int i=1;;i++)
		{
		
			fib = f + s;
			f = s;
			s = fib;
			if(fib>= lower && fib<=upper)
			{
				System.out.print(fib+" ");
			}
			if(fib>upper)
				break;
		}
	}

}
