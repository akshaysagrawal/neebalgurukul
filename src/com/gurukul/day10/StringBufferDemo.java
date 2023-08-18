package com.gurukul.day10;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement ");
		String w = sc.nextLine();
		System.out.println("Enter a word ");
		String n = sc.next();
		
		StringBuffer sb = new StringBuffer(w);
		int x;
		while((x=sb.indexOf(n))!=-1)
		{
			sb = sb.delete(x, x+n.length());
			x = sb.indexOf(n);
		}
		
		System.out.println(sb);
	}

}
