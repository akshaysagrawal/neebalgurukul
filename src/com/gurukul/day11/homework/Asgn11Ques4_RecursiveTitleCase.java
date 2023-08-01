package com.gurukul.day11.homework;

import java.util.Scanner;

class Recursive4
{
    
    static String titlecase(String[] s, int length, String res)
    {
	
	if (length == 0)
	    return null;
	else {
	    res += (Character.toUpperCase(s[length].charAt(0)) + s[length].substring(1));
	    res = titlecase(s, length , res);
	    return res;
	}
    }
}

public class Asgn11Ques4_RecursiveTitleCase {
   
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str = sc.nextLine();
	String s[] = str.split(" ");
	String rs = "";
	String res = Recursive4.titlecase(s, s.length - 1, rs);
	for (String p : s)
	    System.out.print(p);
    

    }
}
