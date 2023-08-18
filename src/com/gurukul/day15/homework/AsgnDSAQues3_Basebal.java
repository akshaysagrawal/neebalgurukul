package com.gurukul.day15.homework;

import java.util.Stack;

class Baseball
{
    String[] score;

    public Baseball(String[] score) {
	this.score=score;
}


    public int baseballscore() {
	int sum=0;
	Stack<String> stack = new Stack();
	for(int i=0;i<score.length;i++)
	{
	    String s= score[i];
	    if (s == "C") {
		sum -= Integer.parseInt(stack.pop());
	    } else if (s == "D") {
		int a = Integer.parseInt(stack.peek()) * 2;
		sum += a;
		stack.push("" + a);
	    } else if (s == "+") {
		String t1 = stack.pop();
		String t2 = stack.peek();
		stack.push(t1);
		int a = Integer.parseInt(t1) + Integer.parseInt(t2);
		sum += a;
		stack.push("" + a);
	    } else {
		stack.push(score[i]);
		sum += Integer.parseInt(score[i]);
	    }
	}    
	return sum;
    }
    
}


public class AsgnDSAQues3_Basebal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String arr[] = {"5","-2","4","C","D","9","+","+"};
	Baseball exp = new Baseball(arr);
	int a=exp.baseballscore();
	System.out.println(a);
		
    }

}
