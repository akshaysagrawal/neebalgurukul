package com.gurukul.day3;

public class ForLoopPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print((char)(j+64)+" ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
