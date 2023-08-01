package com.gurukul.day15.homework;

import java.util.Scanner;
import java.util.Stack;

class RevStack
{
    String s;

    public RevStack(String s) {
	this.s = s;
    }
    
    boolean convertReverse()
    {
	char c[] = s.toCharArray();
	Stack<Character> stack = new Stack();
	int i=0;
	while(c[i]!='C' && c[i]!='c')
	{
	    stack.push(c[i]);
	    i++;	   
	}
	i++;
	while(!stack.isEmpty())
	{
	    if(c[i] != stack.peek())
	    {
		return false;
	    }
	    stack.pop();
	   i++;
	   
	}
	return true;
	    
    }
    
}

public class AsgnDSAQues1_xCy {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Enter a string ");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	RevStack  rev = new RevStack(s);
	boolean flag = rev.convertReverse();
	if(flag==true)
	{
	    System.out.println("The string is in xCy format");
	}
	else
	    System.out.println("The string is not in xCy format");
    }

}
