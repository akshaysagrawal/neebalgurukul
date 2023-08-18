package com.gurukul.day1;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// Input
		System.out.println("Enter distance in kilometers ");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		// Process
		double meters = km * 1000;
		double cm = meters * 100;
		double inches = cm / 2.54;
		double feet = inches / 12;
		// Output
		System.out.println("The distance in km is : "+ km);
		System.out.println("The distance in meters is : "+ meters);
		System.out.println("The distance in cm is : "+ cm);
		System.out.println("The distance in inches is : "+ inches);
		System.out.println("The distance in feet is : "+ feet);
	}

}
