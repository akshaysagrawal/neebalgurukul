package com.gurukul.day11;

public class StraightSelectionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int a[] = {8,15,7,2,11,4};
	
	int i,j;
	for (i=0;i<a.length;i++)
	{
	    int s=i;
	    for(j=s+1;j<a.length;j++)
	    {
		if(a[j]<a[s])
		{
		    s=j;
		}
	    }
	    int t = a[i];
	    a[i]= a[s];
	    a[s] = t;
	}
	
	for(i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+" ");
	}

    }

}
