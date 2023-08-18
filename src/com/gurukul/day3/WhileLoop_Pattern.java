package com.gurukul.day3;

public class WhileLoop_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5)
		{
			int j = 1;
			while(j<=5-i)
			{
				System.out.print(" ");
				j++;
			}
			j=i;
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			j=2;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
			
		}
	}

}
