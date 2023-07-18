package com.gurukul.day2;

import java.util.Scanner;

public class ForLoop_PowerToBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,power,i;
		int result =1;
		System.out.println("Enter base ");
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		System.out.println("Enter power ");
		power = sc.nextInt();
		
		for(i=1;i<=power;i++)
		{
			result = result * base;
		}
		System.out.println(base+" to the power "+power+" is "+result);
	}

}
