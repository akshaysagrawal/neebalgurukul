package com.gurukul.day2;

import java.util.Scanner;

public class PolarToCartesian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double degree,theta, r,x,y;
		System.out.println("Enter the value of r");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		System.out.println("Enter the value of theta");
		degree = sc.nextDouble();
		theta = Math.toRadians(degree);
		x = r * Math.cos(theta);
		y = r * Math.sin(theta);
		
		System.out.println("(r,theta) : "+"("+r+" , "+theta+")");
		System.out.println("(x,y) : "+"("+x+" , "+y+")");
		
	}

}
