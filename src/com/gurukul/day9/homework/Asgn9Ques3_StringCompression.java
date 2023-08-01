package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques3_StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x = sc.nextLine();
		char a[] = x.toCharArray();
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
			{
				count ++;
				 String z =  x.replace(x, count);
			}
		}
		
	}

}
