package com.gurukul.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "ram is in bad mood";
		
		String regex = "^[\\D][a-zA-Z0-9]{2}"; //finding 3 letter words in a string
					//"^[^0-9][a-zA-Z0-9]{2}";
		Pattern pattern = Pattern.compile(regex);
		
		String a[]=test1.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			Matcher matcher = pattern.matcher(a[i]);
			if(matcher.matches())
			{
				count ++;
			}
		}
		System.out.println(count);
	}

}
