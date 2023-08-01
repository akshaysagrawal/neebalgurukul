package com.gurukul.day11;

public class StraightInsertionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//Straight Insertion Sort
	
	int a[] = {8,7,11,2,9,4};
	int t=0;
	int i,j;
	for (i=0;i<a.length;i++)
	{
	    t = a[i];
	    for(j=i;j>0 && a[j-1]>t;j--)
	    {
		a[j] = a[j-1];
	    }
	    a[j] = t;
	}
	
	for(i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+" ");
	}
	
    }
}
