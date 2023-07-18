package com.gurukul.day1.homework;

import java.util.Scanner;

public class AsgnQues1_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter time in milliseconds ");
		Scanner sc = new Scanner(System.in);
		int millsec = sc.nextInt();
		int sec = millsec/1000;
		int mins = sec/60;
		int hrs = mins/60;
		mins = mins % 60;
		sec = sec % 60;
		System.out.println(hrs + " : " +mins+ " : " +sec);
	}

}
