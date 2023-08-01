package com.gurukul.day11.homework;


class Recursive1
{
    static int sum(int a[],int i)
    {

	if(i==a.length)
	{
	    return 0;
	}
	else
	{
	    return a[i] + sum(a,i+1);
	}
    }
}

public class Asgn11Ques1_RecursiveSumOfElements {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[] = {1,2,3,4,5};
	int b[] = {0,0,0,0,0};
	int c[] = {10,20,30,40,50};
	int d[] = {-1,-2,-3,-4,-5};
	int e[] = {3};
	
	int s = Recursive1.sum(a,0);
	int t = Recursive1.sum(b,0);
	int u = Recursive1.sum(c,0);
	int v = Recursive1.sum(d,0);
	int w = Recursive1.sum(e,0);
	
	System.out.println(s);
	System.out.println(t);
	System.out.println(u);
	System.out.println(v);
	System.out.println(w);
	
    }

}
