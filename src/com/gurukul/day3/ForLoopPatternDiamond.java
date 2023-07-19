package com.gurukul.day3;

public class ForLoopPatternDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
				System.out.print("\t");
			for(int j=1;j<=i;j++)
				System.out.print("\t"+j);
			for(int j=i-1;j>=1;j--)
				System.out.print("\t"+j);
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			// Spaces
			for(int j=1;j<=5-i;j++)
				System.out.print("\t");
			// Increasing first part
			for(int j=1;j<=i;j++)
				System.out.print("\t"+j);
			// Decreasing second part
			for(int j=i-1;j>=1;j--)
				System.out.print("\t"+j);
			System.out.println();
		}
	}

}
