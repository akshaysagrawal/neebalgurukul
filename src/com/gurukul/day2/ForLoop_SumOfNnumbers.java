package com.gurukul.day2;

import java.util.Scanner;

public class ForLoop_SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		int sum = 0;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			sum = sum +i;
		}
		System.out.println("Sum of first "+num+" numbers is "+sum);
	}

}
