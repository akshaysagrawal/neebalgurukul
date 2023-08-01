package com.gurukul.day11;

public class HeapSelectionSort {

    static void heapify(int a[],int p,int n)
    {	int i;
	int t=a[p];
	for(i=2*p+1;i<n;i=2*i+1)
	{
	    if((i+1)<n && a[i]<a[i+1])
	    {
		i++;
	    }
	    if(a[i]>t)
	    {
		a[(i-1)/2] = a[i];
	    }
	    else
		break;
	}
	a[(i-1)/2] = t;
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[] = {8,15,7,2,11,4,5,9};
	int n= a.length;
	int b,c,i,t;
	for(i = n/2-1; i>=0; i--)
	{	
    		heapify(a,i,n);
	}
	
	for(i=n-1;i>0;i--)
	{
	    t = a[0];
	    a[0] = a[i];
	    a[i] = t;
	    heapify(a,0,i);
	}
	
	for(i=0;i<n;i++)
	{
	    System.out.println(a[i]);
	}
	
    }

}
