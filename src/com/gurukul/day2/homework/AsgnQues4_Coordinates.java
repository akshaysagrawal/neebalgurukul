package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues4_Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		System.out.println("Enter x coordinate");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		System.out.println("Enter y coordinate");
		y = sc.nextDouble();
		
		if(x>0 && y>0)
			System.out.println("1st Quadrant");
		else if(x<0 && y>0)
			System.out.println("2nd Quadrant");
		else if(x<0 && y<0)
			System.out.println("3rd Quadrant");
		else if(x>0 && y<0)
			System.out.println("4th Quadrant");
		else if(x==0 && y!=0)
			System.out.println("Y axis");
		else if(x!=0 && y==0)
			System.out.println("X axis");
		else 
			System.out.println("Origin");
			
	}

}
