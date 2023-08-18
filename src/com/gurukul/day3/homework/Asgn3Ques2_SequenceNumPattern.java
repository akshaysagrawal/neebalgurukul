package com.gurukul.day3.homework;

public class Asgn3Ques2_SequenceNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 1;
		for(int i=1;i<=6;i++)
		{
			for(int j=6-i;j>=1;j--)		
				System.out.print(" ");
			for(int j=i;j>=1;j--)
			{
				System.out.print(ch);
				ch = ch+1;
				if(ch>9)
					ch=0;
			}
			System.out.println();
		}
	}

}
