package com.gurukul.day1;

import java.util.Scanner;

public class ReverseOfThreeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a three digit number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int d1 = number % 10;
		int d2 = (number/10) % 10;
		int d3 = number/100;
		int sumOfDigit = d1 + d2 + d3;
		int reverse = (d1*100) + (d2*10)+ d3;
		int sumOfReverse = number + reverse;
		System.out.println("The sum of digit is "+sumOfDigit);
		System.out.println("Reverse of number is "+reverse);
		System.out.println("Sum of reverses and number is "+sumOfReverse);
	}

}
