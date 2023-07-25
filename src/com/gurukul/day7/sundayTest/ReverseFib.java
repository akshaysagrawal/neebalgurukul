package com.gurukul.day7.sundayTest;

import java.util.Scanner;

public class ReverseFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series");
		int num = sc.nextInt();
		int first = 0;
		int second = 1;
		int fib=1;
		int a[]=new int[num];
		
		for(int i=1;i<=num-1;i++)
		{
			a[i] = fib;
			fib = first + second;
			first = second;
			second = fib;
			
			//System.out.print(a[i]+" ");	
		}
		
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
				
						
				
			
		
	}

}
