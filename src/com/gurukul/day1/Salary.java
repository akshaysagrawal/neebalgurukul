package com.gurukul.day1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the salary ");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		if(salary<30000)
		{
			salary = salary + (salary*5/100);
		}
		System.out.println("The salary is "+salary);
	}

}
