package com.gurukul.day9;

import java.util.Scanner;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String w = "hello";
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int c = 0;
		for(int i=0;i<w.length();i++)
		{
			char ch = w.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
			{
				c++;
			}
		}
		System.out.println("Number of vowewls are "+c);
	}

}
