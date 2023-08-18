package com.gurukul.day2.homework;

import java.util.Scanner;

public class AsgnQues1_PolarCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1,r2,r3,theta1,theta2,theta3,degree1,degree2,degree3,x1,x2,y1,y2,x3,y3;
		System.out.println("Enter the value of r1");
		Scanner sc = new Scanner(System.in);
		r1 = sc.nextDouble();
		System.out.println("Enter the value of r2");
		r2 = sc.nextDouble();
		System.out.println("Enter the value of theta1 in degree");
		degree1 = sc.nextDouble();
		System.out.println("Enter the value of theta2 in degree");
		degree2 = sc.nextDouble();
		theta1 = Math.toRadians(degree1);
		theta2 = Math.toRadians(degree2);
		x1 = r1 * Math.cos(theta1);
		y1 = r1 * Math.sin(theta1);
		x2 = r2 * Math.cos(theta2);
		y2 = r2 * Math.sin(theta2);
		x3 = x1 + x2;
		y3 = y1 + y2;
		r3 = Math.hypot(x3, y3);
		theta3 = Math.atan2(y3, x3);
		degree3 = Math.toDegrees(theta3);
		
		System.out.println("r3 = "+r3+" theta3 = "+degree3);
	}

}
