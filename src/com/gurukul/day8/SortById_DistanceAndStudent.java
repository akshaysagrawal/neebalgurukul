package com.gurukul.day8;

interface Show
{
	int getId();
}

class Distance implements Show
{
	int id;
	double m,cm;
	
	Distance(int id, double m, double cm)
	{
		this.id = id;
		this.m = m;
		this.cm = cm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}
	
	public String toString()
	{
		return "id:"+id+" m:"+m+" cm:"+cm;
	}
}

class Student implements Show
{
	int id;
	String name;
	int age;
	int fees;
	
	Student(int id,String name, int age,int fees)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.fees = fees;
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



	public int getFees() {
		return fees;
	}



	public void setFees(int fees) {
		this.fees = fees;
	}



	public String toString()
	{
		return "id:"+id+" name:"+name+" age:"+age+" fees:"+fees;
	}
}

public class SortById_DistanceAndStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1 = new Distance(1,100,50);
		Distance d2 = new Distance(5,200,40);
		Distance d3 = new Distance(3,50,60);
		
		Student s1 = new Student(8,"Ram",20,5000);
		Student s2 = new Student(4,"Ajay",32,7000);
		
		Show a[] = new Show[5];
		a[0] = d1;
		a[1] = d2;
		a[2] = d3;
		a[3] = s1;
		a[4] = s2;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].getId()>a[j+1].getId())
				{
					Show t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}
