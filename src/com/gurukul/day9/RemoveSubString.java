package com.gurukul.day9;

import java.util.Scanner;

public class RemoveSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String x = sc.nextLine();
		System.out.println("Enter a word");
		String y = sc.next();
		
		int a = x.indexOf(y);
		int b = y.length();
		while(a!=-1)
		{
			x= x.substring(0,a) +x.substring(a+b);
			a=x.indexOf(y);
		}
		System.out.println(x);
	}

}
