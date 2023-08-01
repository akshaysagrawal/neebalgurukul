package com.gurukul.day14;

import java.io.IOException;
import java.util.Scanner;

public class BasicInputOutput {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	System.out.println("Enter anything");
//	Scanner sc = new Scanner(System.in);
//	String s =sc.nextLine();
//	System.out.println("You have enter: ");
//	System.out.println(s);
	
	
	//only input without scanner
	
	try
	{
	    System.out.println("Enter an input");
	    int a = System.in.read();
	    System.out.println("input was "+a);
	    
	}
	catch(IOException e)
	{
	    System.err.println("Error in i/p");
	
	}
	
	
	
	
	
    }
}
