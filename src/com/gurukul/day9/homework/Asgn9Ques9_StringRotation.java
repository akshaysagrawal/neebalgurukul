package com.gurukul.day9.homework;

//Helped by Shrikant

import java.util.Scanner;

public class Asgn9Ques9_StringRotation {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter a statement");
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	System.out.println("Enter a string");
	String b = sc.next();
	if (a.length() != b.length()) {
	    System.out.println("The given strings are not rotations of each other");
	} 
	else 
	{
	    boolean flag = false;
	    for (int i = 0; i < a.length() - 1; i++) 
	    {
		String res = "";
		char temp = a.charAt(a.length() - 1);
		res += temp;
		for (int j = 0; j < a.length() - 1; j++) {
		    res += a.charAt(j);
		}

		if (res.equals(b)) {
		    flag = true;
		    break;
		}
		a = res;
	    }
	    if (flag) {
		System.out.println("The given strings are rotations of each other");
	    } else {
		System.out.println("The given strings are not rotations of each other");
	    }

	}
    }
}
