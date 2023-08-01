package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques11_CountWordsCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in camel case");
		String x = sc.nextLine();
		
		char a[]=x.toCharArray();
		int count =1;
		for(int i=0;i<a.length;i++)
		{
			if(Character.isUpperCase(a[i]))
			{
				count ++;
			}
		}
		System.out.println(count);
	}

}
