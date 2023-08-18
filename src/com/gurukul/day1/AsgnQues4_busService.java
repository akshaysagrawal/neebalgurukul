package com.gurukul.day1;

import java.util.Scanner;

public class AsgnQues4_busService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of people ");
		Scanner sc = new Scanner(System.in);
		 int people = sc.nextInt();
		 int peopleTravelling =  50 * (people/50);
		 
		 System.out.println("number of bookings: "+people);
		 System.out.println("people travelling: "+peopleTravelling);
	}

}
