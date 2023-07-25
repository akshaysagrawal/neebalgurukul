package com.gurukul.day8;

import java.util.ArrayList;
import java.util.List;

class Student2
{
	int id;
	String name;
	int age;
	
	
	Student2(int id,String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public String toString()
	{
		return "id:"+id+" name:"+name+" age:"+age;
	}
}

public class ArrayList_StudentAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Student2> list1 = new ArrayList<>();
		list1.add(new Student2(1,"ram",14));
		list1.add(new Student2(2,"sam",20));
		list1.add(new Student2(3,"karan",16));
		list1.add(new Student2(4,"amar",12));
		list1.add(new Student2(5,"minal",18));
		
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getAge()>=15)
			{
				System.out.println(list1.get(i));	
			}
		}
	}

}
