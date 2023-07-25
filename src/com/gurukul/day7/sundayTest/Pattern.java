package com.gurukul.day7.sundayTest;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		boolean bool=true;
			do 
			{
				System.out.println("Enter the number of rows");
				int r = sc.nextInt();
				for(int i=1;i<=r;i++)
				{
					for(int j=1;j<=r-i;j++)
						System.out.print(" ");
					for(int j=1;j<=i;j++)
					{
						if(j%2==1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					for(int j=i-1;j>=1;j--)
					{
						if(j%2==1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
				if(r<0)
				{
					bool = false;
				}
				
			}
			while(bool);
			
		
	}

}
