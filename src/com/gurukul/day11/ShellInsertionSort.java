package com.gurukul.day11;

public class ShellInsertionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	//Shell Insertion Sort
	
	int a[] = {8,7,11,2,9,4};
	int t=0;
	int i,j;
	
	int n=a.length;
	for(int g=n/2;g>=1;g=g/2)
	{
        	for (i=0;i<a.length;i++)
        	{
        	    t = a[i];
        	    for(j=i;j>=g && a[j-g]>t;j-=g)
        	    {
        		a[j] = a[j-g];
        	    }
        	    a[j] = t;
        	}
	}	
	
		for(i=0;i<a.length;i++)
		{
		    System.out.print(a[i]+" ");
		}
    }

}
