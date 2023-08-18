package com.gurukul.day6;

public class ArreayDemo_InterchangefromMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,11,12,20,21,22,23};
		int i,j;
		int t;
		for (i=0,j=(a.length/2)+(a.length%2);j<a.length;i++,j++)
		{
			t=a[i];	
			a[i]=a[j];
			a[j]=t;	
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
			
		}
	}

}
