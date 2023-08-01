package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques4_BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char a[] = x.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == '(')
			{
				count ++; 
			}
			else if(a[i] == ')')
			{
				count --;
			}
			if(count<0)
			{
				break;
			}
		}
		if(count == 0)
		{
			System.out.println("The string containing parenthesis is balanced");
		}
		else
			System.out.println("The string containing parenthesis is not balanced");		
	}

}
