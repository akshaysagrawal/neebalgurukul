package com.gurukul.day16;

import java.util.Hashtable;

public class HashTable_NumberToWords {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int num = 3450;
	String w="";
	
	Hashtable <Integer,String> hash = new Hashtable<>();
	hash.put(0,"zero");
	hash.put(1,"one");
	hash.put(2,"two");
	hash.put(3,"three");
	hash.put(4,"four");
	hash.put(5,"five");
	hash.put(6,"six");
	hash.put(7,"seven");
	hash.put(8,"eight");
	hash.put(9,"nine");
	
	while(num!=0)
	{
	    int a=num%10;
	    if(hash.containsKey(a)) {
		w =hash.get(a)+" "+w;
	    }
	    num=num/10;	
	}
	System.out.print(w);
	
    }

}
