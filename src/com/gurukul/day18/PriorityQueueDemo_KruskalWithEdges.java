package com.gurukul.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//this code is part of another program and this program hence it is commented here----------

//class Edge{
//	private int parent,child,cost;
//
//	public int getParent() {
//		return parent;
//	}
//
//	public void setParent(int parent) {
//		this.parent = parent;
//	}
//
//	public int getChild() {
//		return child;
//	}
//
//	public void setChild(int child) {
//		this.child = child;
//	}
//
//	public int getCost() {
//		return cost;
//	}
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//	public Edge(int parent, int child, int cost) {
//		super();
//		this.parent = parent;
//		this.child = child;
//		this.cost = cost;
//	}
//
//	@Override
//	public String toString() {
//		return "Edge [parent=" +((char) (parent+65)) + ", child=" + (char)(child+65) + ", cost=" + cost + "]";
//	}
//	
//}

public class PriorityQueueDemo_KruskalWithEdges {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	PriorityQueue<Edge> pq = new PriorityQueue<>(new Comparator<Edge>() {

	    @Override
	    public int compare(Edge o1, Edge o2) {
		// TODO Auto-generated method stub
		return o1.getCost() - o2.getCost();
	    }
	});

	pq.add(new Edge(0, 1, 4));
	pq.add(new Edge(0, 3, 8));
	pq.add(new Edge(1, 2, 3));
	pq.add(new Edge(2, 6, 2));

	pq.add(new Edge(2, 7, 1));
	pq.add(new Edge(7, 6, 7));
	pq.add(new Edge(5, 6, 6));
	pq.add(new Edge(4, 5, 7));

	pq.add(new Edge(3, 4, 3));
	pq.add(new Edge(3, 5, 4));
	pq.add(new Edge(3, 6, 5));
	pq.add(new Edge(7, 5, 2));

	int nodeCount = 8;
	int parent[] = new int[nodeCount];
	Arrays.fill(parent, -1);
	for (int i = 1; i < nodeCount;) {
	    Edge edge = pq.poll();
	    int p = edge.getParent();
	    int c = edge.getChild();

	    while (parent[p] != -1) {
		p = parent[p];
	    }
	    while (parent[c] != -1) {
		c = parent[c];
	    }
	    if (p != c) {
		System.out.println(edge);
		i++;
		parent[c] = p;
	    }
	}

    }

}
