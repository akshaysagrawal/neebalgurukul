package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques15_ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		String s[] = w.split(" ");
		String x="";
		for(int i=s.length-1;i>=0;i--)
		{
			x +=s[i]+" ";
			
		}
		System.out.print(x);
	}

}
