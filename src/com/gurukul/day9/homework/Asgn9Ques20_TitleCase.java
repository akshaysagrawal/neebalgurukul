package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques20_TitleCase {

	public static void main(String[] args) {
		
		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char a[] = x.toCharArray();
		String b="";
		char z;
		for(int i=0;i<a.length;i++)
		{	
			z=a[i];
			if(i==0)
			{
				z =Character.toUpperCase(a[i]);
			}
			
			if(a[i]==' ')
			{
				z =Character.toUpperCase(a[i+1]);
				if(i!=a.length-1)
					i++;
					b=b+" ";
			}
			b = b+ z; 
		}
			
			System.out.print(b);
		
	}
}
