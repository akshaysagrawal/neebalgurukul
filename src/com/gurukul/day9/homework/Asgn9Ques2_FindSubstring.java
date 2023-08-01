package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques2_FindSubstring {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String x = sc.nextLine();
	System.out.println("Enter a word");
	String y = sc.next();

	int i = 0;
	while (x.indexOf(y, i) != -1) {
	    i = x.indexOf(y, i);
	    System.out.print(i + " ");
	    i++;
	}
    }

}
