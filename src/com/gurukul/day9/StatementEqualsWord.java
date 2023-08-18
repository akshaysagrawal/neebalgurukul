package com.gurukul.day9;

import java.util.Scanner;

public class StatementEqualsWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement");
		String statement = sc.nextLine();
		System.out.println("Enter a word");
		String word = sc.next();
		int c=0;
		int i=0;
			while((i= statement.indexOf(word, i))!=-1)
			{
				c++;
				i++;
			}
			System.out.println(c);
		}
		
	}


