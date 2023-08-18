package com.gurukul.day15.homework;

import java.util.Scanner;
import java.util.Stack;

class AstroidStack
{
    int a[];

    public AstroidStack(int[] s) {
	this.a = s;
    }

    void collision()
    {
	Stack<Integer> stack = new Stack();
	for(int i=0;i<a.length;i++)
	{
	    if(stack.isEmpty())
	    {
		stack.push(a[i]);
	    }
	    else if(a[i]>0)
	    {
		stack.push(a[i]);
	    }
	    else if(a[i]<0)
	    {
		if(Math.abs(a[i])>Math.abs(stack.peek()))
		{
		    stack.pop();
		    stack.push(a[i]);
		}
	    }
	    
	}
    }
    
}
public class AsgnDSAQues6_Astroids {
    public static void main(String[] args) {
	
	int size[] = {10,2,5};
	
	AstroidStack as = new AstroidStack(size);
	
    }
}
