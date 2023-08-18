package com.gurukul.day11.homework;
class Recursive5
{
    
    static int camelcase(String s,int i)
    {
	
	if(i==s.length())
	{ 
	    return 1;
	}
	else
	{
	    if ((Character.isUpperCase(s.charAt(i))))
	    {
		return 1 + camelcase(s, i + 1);	
	    }
	}
	return camelcase(s, i + 1);
    }
}

public class Asgn11Ques5_CountCamelCase {
    public static void main(String[] args) {
	
	String a = "thisIsCamelCase";
	String b = "iAmHappyToday";
	int w = Recursive5.camelcase(a, 0);
	int v = Recursive5.camelcase(b, 0);
	
	System.out.println(w);
	System.out.println(v);
	
    }
}
