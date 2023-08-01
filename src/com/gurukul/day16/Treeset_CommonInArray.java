package com.gurukul.day16;

import java.util.TreeSet;

public class Treeset_CommonInArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int a[]= {1,5,6,3,4};
	int b[]= {1,8,6,3,4};
	int c[]= {1,5,7,3,9};
	
	TreeSet <Integer> tree1 = new TreeSet<>();
	for(int i=0;i<a.length;i++)
	{
	    tree1.add(a[i]);
	}
	System.out.println(tree1);
	
	TreeSet <Integer> tree2 = new TreeSet<>();
	for(int i=0;i<b.length;i++)
	{
	    tree2.add(b[i]);
	}
	System.out.println(tree2);
	
	TreeSet <Integer> tree3 = new TreeSet<>();
	for(int i=0;i<c.length;i++)
	{
	    tree3.add(c[i]);
	}
	System.out.println(tree3);
	
	tree1.retainAll(tree2);
	tree1.retainAll(tree3);
	System.out.println(tree1);
	
    }

}
