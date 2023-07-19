package com.gurukul.day3.homework;

import java.util.Scanner;

public class Asgn3Ques7_NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int s =0;
		int sum =0;
		String w="";
		while(y!=0)
		{
			sum = (sum * 10)+(y%10);
			y = y/10;
		}
		while(sum!=0)
		{
			s = sum%10;
			sum = sum/10;
			switch(s)
			{
			case 1:
				w = "one";
				break;
			case 2:
				w = "two";
				break;
			case 3:
				w = "three";
				break;
			case 4:
				w = "four";
				break;
			case 5:
				w = "five";
				break;
			case 6:
				w = "six";
				break;
			case 7:
				w = "seven";
				break;
			case 8:
				w = "eight";
				break;
			case 9:
				w = "nine";
				break;
			case 0:
				w = "zero";
				break;
			}
			System.out.print(w+" ");
		}
	}

}
