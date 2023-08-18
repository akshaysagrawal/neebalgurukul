package com.gurukul.day2.homework;

public class AsgnQues5_Fibonaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int s = 1;
		int t;
		int count = 0;
		for(int i = 1;;i++)
		{
			t = f + s;
			f = s;
			s = t;
			if(t%2==0)
			{
				System.out.println(t);
				count ++;
			}
			if(count>10)
				break;
		}
	}

}
