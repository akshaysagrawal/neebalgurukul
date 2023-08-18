package com.gurukul.day1;

import java.util.Scanner;

public class AsgnQues7_24hrClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time, hours11,hours, mins;
		System.out.println("Enter time in 24 hour format ");
		Scanner sc = new Scanner(System.in);
		time = sc.nextInt();
		hours = time/100;
		hours11 = hours%12;
		mins = time%100;
		if(hours > 12)
		{
			System.out.println(hours11+" : "+mins+" pm");
		}
		else
		{
			System.out.println(hours11+" : "+mins+" am");
		}
		
	}

}
