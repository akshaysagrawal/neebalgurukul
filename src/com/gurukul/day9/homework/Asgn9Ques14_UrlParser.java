package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques14_UrlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an URL");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		String a[] = x.split("/|:");
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		System.out.println(a[3]);
	}

}
