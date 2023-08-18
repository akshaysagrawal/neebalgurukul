package com.gurukul.day15;

import java.util.Stack;

public class Stack_balancedEquation {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	String s = ")(a+b)*(c-d)";
	char c[] = s.toCharArray();
	
	Stack<Character> x = new Stack<>();
	for(int i=0;i<c.length;i++)
	{
		if(c[i] == '(')
		{
			x.push(c[i]); 
		}
		else if(c[i] == ')')
		{
		    if(x.isEmpty())
			{
			    System.out.println("Equation is not balanced");
			    return;
			}
		    else
		    {
			x.pop();
		    }
		}
	}
	if(x.isEmpty())
	{
	    System.out.println("Equation is balanced");
	}
	else
	{
	    System.out.println("Equation is not balanced");
	}

    }

}
