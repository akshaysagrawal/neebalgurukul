package com.gurukul.day15.homework;

import java.util.Stack;

class PostFixExpression
{
    String exp;

    public PostFixExpression(String exp) {
	this.exp=exp;
    }

    public String convertInfix() 
    {
	String infix = "";
	char c[] = exp.toCharArray();

	Stack<String> x = new Stack<>();
	for (int i = 0; i < c.length; i++) {
            if(Character.isAlphabetic(c[i]) || Character.isDigit(c[i])) {
        	x.push(c[i]+"");
            }
            else
            {
        	String a = x.pop();
        	String b = x.pop();
        	infix = "("+b+c[i]+a+")";
        	x.push(infix);
            }    
	}
	return infix;
    }
 
    
    
}

public class AsgnDSAQues2_PostfixToInfix {
    
public static void main(String[] args) {
    
    	PostFixExpression exp = new PostFixExpression("ab+cd/-");
	String inFix=exp.convertInfix();
	System.out.println(inFix);
	
    }
}
