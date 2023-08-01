package com.gurukul.day10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ques1_RegexVowel {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String w = sc.nextLine();
	String regex = "^[aeiouAEIOU].*";
	
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(w);

	if(matcher.matches())
	{
		System.out.println("String Matches");
	}
	else
	{
		System.out.println("String does not match");
	}
    }

}
