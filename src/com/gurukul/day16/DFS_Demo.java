package com.gurukul.day16;

import java.util.Stack;

public class DFS_Demo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int a[][]= {{0,1,0,1,0,0,0},
		{1,0,1,0,0,0,1},
		{0,1,0,0,0,1,1},
		{1,0,0,0,1,0,1},
		{0,0,0,1,0,1,0},
		{0,0,1,0,1,0,1},
		{0,1,1,1,0,1,0}};
	
	Stack<Integer> stack = new Stack<>();
	boolean visited[] = new boolean[a.length];
	int s=0; 
	visited[0] = true;
	System.out.print((char)(65)+" ");
	stack.push(s);
	while(!stack.isEmpty())
	{
	    s = stack.peek();
	    boolean flag = false;
	    for(int i=0;i<a.length;i++)
	    {
		if(a[s][i]==1 && !visited[i])
		{
		    flag = true;
		    stack.push(i);
		    System.out.print((char)(i+65)+" ");
		    visited[i]=true;
		    break;
		}
	    }
	    if(!flag)
	    {
		stack.pop();
	    }
	}
    }

}
