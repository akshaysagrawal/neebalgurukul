package com.gurukul.day2;

import java.util.Scanner;

public class ForLoopTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,result;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			result = num * i;
			System.out.println(num+" * "+i+" = "+result);
		}
	}

}
