package com.gurukul.day16;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Deque_Pallindrome {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	Deque <Character> deque = new ArrayDeque<>();
	for(int i=0;i<s.length();i++)
	{
	   deque.addLast(s.charAt(i));
	}
	boolean flag=true;
	while(deque.size()>1)
	{
	    char first = deque.removeFirst();
	    char last = deque.removeLast();
	    if(first != last)
	    {
		flag = false;
		break;
	    }
	}
	if(flag==true)
	{
	    System.out.println("String is a pallindrome");
	}
	else
	    System.out.println("String is not a pallindrome");
	
    }

}
