package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques6_ReplaceCharacteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println("Enter a character that should be replaced");
		String y = sc.nextLine();
		System.out.println("Enter a character to be replaced");
		String z = sc.nextLine();
		
		String a = x.replaceAll(y, z);
		
		System.out.println(a);
	}

}
