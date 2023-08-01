package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques7_CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a statement to encrypt and decrypt");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println("Enter the shift value");
		int n = sc.nextInt();
		String a ="";
		
		System.out.println("Encrypted text: ");
		for(int i=0;i<x.length();i++)
		{
			char ch = x.charAt(i);
			ch = (char)(ch +n);
			a+=ch;
			System.out.print(ch);
		}
	
		System.out.println();
		System.out.println("Decrypted text: ");
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			ch = (char)(ch -n);
			
			System.out.print(ch);
		}
		
		
	}

}
