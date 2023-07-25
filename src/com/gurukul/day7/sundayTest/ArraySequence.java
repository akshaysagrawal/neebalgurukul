package com.gurukul.day7.sundayTest;

import java.util.Scanner;

public class ArraySequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for (int i=0;i<=n-1;i++)
		{
			System.out.println("Enter the value of array");
			a[i]=sc.nextInt();
		}
		
		
		System.out.print("Original array: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		
		int minIndex = 0;
		int maxIndex = 0;
		int count=0;
		for (int i=0;i<n-1;i++)
		{
			
			
				if(a[i]<=a[i+1])
				{
					maxIndex = i+1;
					count++;
				}
				if(a[i]>a[i+1])
				{
					minIndex = i+1;
					maxIndex = i;
				}
			
		}
		
		System.out.println("The minimum index of sequence is "+minIndex);
		System.out.println("The maximum index of sequence is "+maxIndex);
		
	}

}
