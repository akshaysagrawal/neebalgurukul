package com.gurukul.day2;

import java.util.Scanner;

public class Area_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double area;
		System.out.println("Select the shape for which area is required ");
		System.out.println("Press 1 for area of square");
		System.out.println("Press 2 for area of circle");
		System.out.println("Press 3 for area of triangle");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
		{
			double side;
			System.out.println("Enter length of side of square ");
			side = sc.nextDouble();
			area = Math.pow(side,2 );
			System.out.println("Area of square is "+area);
		}
		case 2:
		{
			double radius;
			System.out.println("Enter length of radius of circle");
			radius = sc.nextDouble();
			area = Math.PI * Math.pow(radius,2);
			System.out.println("Area of circle is "+area);
		}
		case 3:
		{
			double height,base;
			System.out.println("Enter height of triangle");
			height = sc.nextDouble();
			System.out.println("Enter base of triangle");
			base = sc.nextDouble();
			area = 0.5 * height *base;
			System.out.println("Area of triangle is "+area);
		}
		default:
			System.out.println("please select correct option....");
		}
	}

}
