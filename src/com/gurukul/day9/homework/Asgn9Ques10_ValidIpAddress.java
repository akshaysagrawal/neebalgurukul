package com.gurukul.day9.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Asgn9Ques10_ValidIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an IP address");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		String a[] = x.split("\\.");
		
		String regex = "^[1-9]\\d{0,2}\\";
		
		Pattern pattern = Pattern.compile(regex);
		boolean flag =true;
		for(int i=0;i<a.length;i++)
		{
			Matcher matcher = pattern.matcher(a[i]);
			if(!(matcher.matches()))
			{
				flag = false;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(Integer.parseInt(a[i])>255)
			{
				flag = false;
			}
		}
		
		if(a.length != 4)
		{
			flag = false;
		}
		
		if(flag)
		{
			System.out.println("It is a valid IP Address");
		}
		else
		{
			System.out.println("It is not a valid IP Address");
		}
	}

}
