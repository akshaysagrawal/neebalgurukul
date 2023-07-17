package com.gurukul.day1;

import java.util.Scanner;

public class AsgnQues3_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days, year , month , week;
		System.out.println("Enter the number of days ");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		year = days/365;
		days = days%365;
		month = days/30;
		days = days%30;
		week = days/7;
		days = days%7;
		
		System.out.println(year+" Years: "+month+" Months: "+week+" Weeks: "+days+" Days");
	}

}
