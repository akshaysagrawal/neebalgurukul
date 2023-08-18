package com.gurukul.day6;

public class ArrayDemo_InterchangeSmallestWithLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,11,12,20,21,22};
		int max = a[0];
		int min = a[0];
		int t;
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
				maxIndex = i;
			}
			if(a[i]<min)
			{
				min = a[i];
				minIndex = i;
			}
		}
		
		t = a[maxIndex];
		a[maxIndex] = a[minIndex];
		a[minIndex]= t;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
