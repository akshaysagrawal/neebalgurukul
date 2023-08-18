package com.gurukul.day3.homework;

import java.util.Scanner;

public class Asgn3Ques7_NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int s;
		String w="";
//		while(y!=0)
//		{
//			sum = (sum * 10)+(y%10);
//			y = y/10;
//		}
		while(y!=0)
		{
			s = y%10;
			y = y/10;
			switch(s)
			{
			case 1:
				w = "one "+w;
				break;
			case 2:
				w = "two "+w;
				break;
			case 3:
				w = "three "+w;
				break;
			case 4:
				w = "four "+w;
				break;
			case 5:
				w = "five "+w;
				break;
			case 6:
				w = "six "+w;
				break;
			case 7:
				w = "seven "+w;
				break;
			case 8:
				w = "eight "+w;
				break;
			case 9:
				w = "nine "+w;
				break;
			case 0:
				w = "zero "+w;
				break;
			}
			
		}
		System.out.print(w);
	}

}
