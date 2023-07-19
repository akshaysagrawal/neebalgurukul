package com.gurukul.day3.homework;

public class Asgn3Ques5_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=10000;i++)
		{
			int x=i;
			int y=i;
			int count = 0;
			while(x!=0)
			{
				count++;
				x=x/10;
			}
			Double m = 0.0;
			while(y!=0)
			{
				int a = y%10;
				m = m + Math.pow(a, count);
				y=y/10;
			}
			if(m==i)
			{
				System.out.print(i+" ,");
			}
			
		}
	}

}
