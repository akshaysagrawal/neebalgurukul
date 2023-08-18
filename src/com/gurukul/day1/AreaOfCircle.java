package com.gurukul.day1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double a = Math.PI * Math.pow(r, 2);
		System.out.println("Arera of circle is "+a);
	}

}
