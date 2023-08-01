package com.gurukul.day16;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Demo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int a[][]= {{0,1,0,1,0,0,0},
		{1,0,1,0,0,0,1},
		{0,1,0,0,0,1,1},
		{1,0,0,0,1,0,1},
		{0,0,0,1,0,1,0},
		{0,0,1,0,1,0,1},
		{0,1,1,1,0,1,0}};
	
	Queue<Integer> bfsqueue = new LinkedList<>();
	boolean visited[] = new boolean[a.length];
	int s=0; 
	visited[0] = true;
	System.out.print((char)(65)+" ");
	bfsqueue.add(s);
	while(!bfsqueue.isEmpty())
	{
        	s = bfsqueue.poll();
        	for(int i=0;i<a.length;i++)
        	{
        		if(a[s][i]==1 && !visited[i])
        		{
        		    System.out.print((char)(i+65)+" ");
        		    bfsqueue.add(i);
        		    visited[i]=true;
        		}
        	    
        	}
	}
    }

}
