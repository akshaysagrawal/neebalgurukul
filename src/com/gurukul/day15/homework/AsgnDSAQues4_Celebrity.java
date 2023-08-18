package com.gurukul.day15.homework;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

class Acquantainces
{
    String firstPerson;
    String secondPerson;

    public Acquantainces(String A,String B) {
	super();
	this.firstPerson = A;
	this.secondPerson = B;
    }

    public String getA() {
        return firstPerson;
    }

    public void setA(String a) {
        firstPerson = a;
    }

    public String getB() {
        return secondPerson;
    }

    public void setB(String b) {
        secondPerson = b;
    }
    
    
}



public class AsgnDSAQues4_Celebrity {

    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Acquantainces x = new Acquantainces("a","b");
	Acquantainces y = new Acquantainces("a","c");
	Acquantainces z = new Acquantainces("c","b");
	
	
	Hashtable<String,Integer> hash = new Hashtable<>();
	hash.put("a", 0);
	hash.put("b", 0);
	hash.put("c", 0);

	
	List<Acquantainces> accList = new ArrayList<>();
	accList.add(x);
	accList.add(y);
	accList.add(z);
	
	for(Acquantainces ac : accList) {
	    hash.put(ac.firstPerson, hash.get(ac.firstPerson) + 1 );
	}
	
	for(String ch : hash.keySet()) {
	    int count = hash.get(ch);
	    
	    if(count ==0)
	    {
		System.out.println(ch+" is the celebrity");
	    }
	    
	}
		
    }

}
