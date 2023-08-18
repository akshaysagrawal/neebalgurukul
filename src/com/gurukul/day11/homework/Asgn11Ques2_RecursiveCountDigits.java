package com.gurukul.day11.homework;

class Recursive2
{
    
    static int count(int a)
    {
	int c=0;
	if(a/10==0)
	{
	   c=1;
	   return c;
	}
	else
	{
	    
	    int z = 1+count(a/10);
	    
	    return z;
	}
    }
}

public class Asgn11Ques2_RecursiveCountDigits {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int w = Recursive2.count(12345);
	
	System.out.println(w);
	
    }

}
