package com.gurukul.day1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side of equilaterl triangle ");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area = (Math.sqrt(3)/4) * Math.pow(side,2);
		System.out.println("Area of equilateral triangle is "+ area);
	}

}
