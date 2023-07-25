package com.gurukul.day9;

public class AddTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Aman";
		String second = "sandeep";
				
		if(first.equalsIgnoreCase(second))
			System.out.println("is equal");
		else
		{
			String third = first +" "+ second;
			//String third = first.concat("").concat(second);
			System.out.println(third);
		}
		
	}

}
