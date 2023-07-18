package com.gurukul.day1.homework;

import java.util.Scanner;

public class AsgnQues8_Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double units,charge,amount ;
		System.out.println("Enter the name ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Enter the number of units ");
		units = sc.nextDouble();
		double temp = units;
		if(units < 100)
		{
			charge = units * 4;
		}
		else if(units <= 300)
		{
			units = units - 100;
			charge = (100 * 4)+(units * 5);
		}
		else
		{
			units = units-300;
			charge = (100 * 4)+(200 * 5)+(units*10);
		}
		
		if(charge > 1000)
		{
			charge = charge + (charge*5/100);
		}
		amount = charge + (charge*18/100);
		
		System.out.println("Name: "+name);
		System.out.println("Units: "+temp);
		System.out.println("Amount: "+amount);
	}

}
