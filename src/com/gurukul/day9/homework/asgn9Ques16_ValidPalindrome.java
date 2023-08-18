package com.gurukul.day9.homework;

import java.util.Scanner;

public class asgn9Ques16_ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.toUpperCase();
		String x[] = a.split("[\\W]");
		
		String s="";
		for(int i=0;i<x.length;i++)
		{
			s =s+x[i];
		}
		
		boolean t = true;
		for (int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{	
			char w = s.charAt(i);
			char r = s.charAt(j);
			if(w!=r)
			{
				t = false;
				break;
			}
		}
		if(t == true)
		{
			System.out.println("It is a pallindrome");
		}
		else
			System.out.println("It is not a pallindrome");
	}

}
