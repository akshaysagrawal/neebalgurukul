package com.gurukul.day1.homework;

import java.util.Scanner;

public class AsgnQues2_SwapDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a four digit number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int digit1 = number/100;
		int digit2 = number%100;
		int reverse = (digit2*100)+digit1;
		System.out.println("Input: "+number);
		System.out.println("Output: "+reverse);
	}

}
