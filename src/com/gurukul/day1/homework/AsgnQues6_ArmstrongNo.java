package com.gurukul.day1.homework;

import java.util.Scanner;

public class AsgnQues6_ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,d1,d2,d3;
		double sum;
		System.out.println("Enter a three digit number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		d1 = num%10;
		d2 = (num/10)%10;
		d3 = num/100;
		
		sum = Math.pow(d3,3) + Math.pow(d2,3) + Math.pow(d1,3);
		if(sum==num)
			System.out.println(num+" is an armstrong number");
		else
			System.out.println(num+" is not an armstrong number");
		
	}

}
