package com.gurukul.day17;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Prims_Algorithm {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[][] graph = {
                {Integer.MAX_VALUE, 4, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},  // A
                {4, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},  // B
                {Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 1},  // C
                {8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 4, 5, Integer.MAX_VALUE},  // D
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, 9, Integer.MAX_VALUE, Integer.MAX_VALUE},  // E
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 9, Integer.MAX_VALUE, 6, 2},  // F
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 5, Integer.MAX_VALUE, 6, Integer.MAX_VALUE, 7},  // G
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 7, Integer.MAX_VALUE}   // H
        };
	
	int distance[] = new int [graph.length];
	Arrays.fill(distance, Integer.MAX_VALUE);
	int parent[] = new int[graph.length];
	Arrays.fill(parent,-1);
	boolean selected[] = new boolean[graph.length];
	int start = 0;
	distance[start] = 0;
	selected[start]=true;
		
	for(int j=1;j<distance.length;j++)
	{
	    for(int i=0;i<graph.length;i++)
	    {
		if(graph[start][i]<distance[i] && !selected[i])
		{
		    parent[i] = start;
		    distance[i] = graph[start][i];
		}
	    }
	    int min  = Integer.MAX_VALUE;
	    int minNode = start;
	    for(int i=0;i<distance.length;i++)
	    {
		if(distance[i]<min && !selected[i])
		{
		    min = distance[i];
		    minNode = i;
		}
	    }
	    selected[minNode]=true;
	    start = minNode;
	}
	int cost = 0;
	for(int i=0;i<graph.length;i++)
	{
	    System.out.println((char)(parent[i]+65)+ ", "+(char)(i+65));
	    cost+=distance[i];
	}
	System.out.println("The minimum cost is "+cost);
    }

}
