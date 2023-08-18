package com.gurukul.day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student1
{
	private int id,age;
	private String name;
	
	Student1(int id, int age,String name)
	{
		this.id = id;
		
		this.age = age;
		this.name = name;
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
		return "id:"+id+" age:"+age+" name:"+name;
	}
}

public class ArrayListdemo_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student1> list1 = new ArrayList<>();
		list1.add(new Student1(1,15,"ram"));
		list1.add(new Student1(2,20,"sam"));
		list1.add(new Student1(3,16,"karan"));
		list1.add(new Student1(4,12,"amar"));
		list1.add(new Student1(5,18,"minal"));
		list1.add(new Student1(6,20,"shyam"));
		list1.add(new Student1(7,14,"lakshman"));
		list1.add(new Student1(8,14,"raman"));
		list1.add(new Student1(9,13,"bharat"));
		list1.add(new Student1(10,19,"abc"));
		
		List <Student1> list2 = new ArrayList<>();
		//list2=list1;
		list2.addAll(list1);
		
		//Collections.reverse(list2); //reverse using collections method
		
		(list1.get(5)).setAge(25);
		
//		for(Student1 stud: list1)
//			System.out.println(stud);
		
		
		
		// Sorting by age
		for(int i=0;i<list1.size()-1;i++)
		{
			for(int j=0;j<list1.size()-1;j++)
			{
				if(list1.get(j).getAge()>list1.get(j+1).getAge())
				{
					Student1 t = list1.get(j);
					list1.set(j, list1.get(j+1));
					list1.set(j+1,t);
					
				}
			}
		}
		
//		for(Student1 stud: list1)
//			System.out.println(stud);
		
		//Reverse the list
		
		int i,j;
		for(i=0,j=list2.size()-1;i<j;i++,j--)
		{
				
				Student1 t = list2.get(i);
				list2.set(i, list2.get(j));
				list2.set(j,t);
					
		}
		
		for(Student1 stud: list2)
			System.out.println(stud);
		
		
		
	}

}
