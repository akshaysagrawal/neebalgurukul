package com.gurukul.day9.homework;

import java.util.Scanner;

public class Asgn9Ques5_CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a statement");
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		String s[] = w.split(" ");
		int a = s.length;
		System.out.println("The number of words are "+a);
	}

}
