package com.gurukul.day9;

import java.util.Scanner;

class MyException extends Exception
{
	@Override
	public String toString()
	{
		return "Special char";
	}
}

public class ExceotionHandling_UnicodeCharacter {
	
	static boolean check(int x) throws MyException
	{
		
			if(Character.isAlphabetic(x))
			{
				return true;
			}
			else if(Character.isDigit(x))
			{
				return false;
			}
			else 
			{
				throw new MyException();
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		
		try 
		{
			if(ExceotionHandling_UnicodeCharacter.check(num))
			{
				System.out.println("It is an alphabet");
			}
			else
			{
				System.out.println("It is a digit");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
