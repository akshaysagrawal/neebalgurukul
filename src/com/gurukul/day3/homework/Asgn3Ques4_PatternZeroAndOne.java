package com.gurukul.day3.homework;

public class Asgn3Ques4_PatternZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
