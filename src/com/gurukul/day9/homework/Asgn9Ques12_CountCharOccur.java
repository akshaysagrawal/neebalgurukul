package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques12_CountCharOccur {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String x = sc.nextLine();

	int a[] = new int[122];
	for (int i = 0; i < x.length(); i++) {
	    char ch = x.charAt(i);
	    for (char j = 0; j < a.length; j++) {
		if (ch == j) {
		    a[j]++;
		}
	    }
	}
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == 0) {
		continue;
	    }
	    System.out.print(" " + (char) i + " : " + a[i]);
	}
    }
}
