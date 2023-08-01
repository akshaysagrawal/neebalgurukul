package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques1_RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x = sc.nextLine();
		
		String a[]=x.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}
