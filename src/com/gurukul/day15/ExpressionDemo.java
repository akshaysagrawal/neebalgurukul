package com.gurukul.day15;

import java.util.Stack;

class Expression {
    String exp;

    Expression(String exp) {
	this.exp = exp;
    }

    String convertPostfix() {
	String postfix = "";
	char c[] = exp.toCharArray();

	Stack<Character> x = new Stack<>();

	for (int i = 0; i < c.length; i++) {
            if(precedence(c[i])==0)
        	postfix+=c[i];
            else
	    if (x.isEmpty() || precedence(c[i]) > precedence(x.peek()) || c[i] == '(') {
		x.push(c[i]);
	    } else if (c[i] == ')') {
		while (x.peek()!= '(') {
		   char ch =  x.pop();
		    
		    postfix += ch;
		}
		x.pop();
	    }
	    else if (precedence(c[i]) <= precedence(x.peek())){
		while (!x.isEmpty() && precedence(c[i]) <= precedence(x.peek())) {
		    char ch = x.pop();
		    postfix += ch;
		}
	    } 
	}
	while(!x.isEmpty()) {
		char ch= x.pop();
		postfix += ch;
	    }
	return postfix;
    }

    static int precedence(char op) {
	switch (op) {
	case '*':
	case '/':
	case '%':
	    return 3;
	case '+':
	case '-':
	    return 2;
	case '(':
	case ')':
	    return 1;
	}
	return 0;
    }

    
}

public class ExpressionDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Expression exp = new Expression("a+(b*c-d/e)/(f+g)");
	String postfix=exp.convertPostfix();
	System.out.println(postfix);
	
    }
}
