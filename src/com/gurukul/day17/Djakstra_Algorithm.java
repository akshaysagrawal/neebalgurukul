package com.gurukul.day17;

import java.util.Arrays;

public class Djakstra_Algorithm {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[][] graph = {
                {1000, 4, 1000, 8, 1000, 1000, 1000, 1000},  // A
                {4, 1000, 3, 1000, 1000, 1000, 1000, 1000},  // B
                {1000, 3, 1000, 1000, 1000, 1000, 2, 1},  // C
                {8, 1000, 1000, 1000, 3, 4, 5, 1000},  // D
                {1000, 1000, 1000, 3, 1000, 9, 1000, 1000},  // E
                {1000, 1000, 1000, 4, 9, 1000, 6, 2},  // F
                {1000, 1000, 2, 5, 1000, 6, 1000, 7},  // G
                {1000, 1000, 1, 1000, 1000, 2, 7, 1000}   // H
        };
	
	int distance[] = new int [graph.length];
	Arrays.fill(distance, 1000);
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
		int sum = graph[start][i] + distance[start];
		if(sum<distance[i] && !selected[i])
		{
		    parent[i] = start;
		    distance[i] = sum;
		}
	    }
	    int min  = 1000;
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
	
	for(int i=0;i<graph.length;i++)
	{
	    System.out.println((char)(parent[i]+65)+ ", "+(char)(i+65));
	}

	
    }

}
