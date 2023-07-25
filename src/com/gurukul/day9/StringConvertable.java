package com.gurukul.day9;

import java.util.Scanner;

public class StringConvertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = sc.nextLine();
		try
		{
			int i = Integer.parseInt(word);
			System.out.println("Integer: "+i);
			
		}
		catch(NumberFormatException e)
		{
			try
			{
				System.out.println("Double: "+Double.parseDouble(word));
			}
			catch(NumberFormatException f)
			{
				System.out.println("invalid "+f);
			}
			
		}
	
	}

}
