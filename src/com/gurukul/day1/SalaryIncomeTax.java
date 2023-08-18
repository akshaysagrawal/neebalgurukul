package com.gurukul.day1;

import java.util.Scanner;

public class SalaryIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary,tax;
		System.out.println("Enter the salary ");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextDouble();
		if(salary >1500000)
		{
			tax = salary*30/100;
		}
		else if(salary > 1000000)
		{
			tax = salary*20/100;
		}
		else if(salary > 750000)
		{
			tax = salary*10/100;
		}
		else
		{
			tax=0;
		}
		System.out.println("Salary before tax: " +salary);
		System.out.println("Income tax on salary: "+tax);
		System.out.println("Net salary in hand: "+(salary-tax));
	}
}
