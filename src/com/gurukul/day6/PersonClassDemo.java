package com.gurukul.day6;

import java.util.Scanner;

class Person
{
	String name;
	int age;
	
	Person(){}
	
	Person(String name, int age)
	{
		this.name  = name;
		this.age = age;
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
		return "name: "+name+" age: "+age;
	}
}


class Employee extends Person
{
	int id;
	double salary;
	
	Employee(String name, int age, int id, double salary)
	{
		super(name,age);
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return super.toString()+" Id: "+id+" Salary: "+salary;
	}
}


class Teacher extends Employee
{
	String subject;
	
	Teacher(String name, int age, int id, double salary, String subject)
	{
		super(name,age,id,salary);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

class Principal extends Teacher
{
	int experience;
	
	Principal(String name, int age, int id, double salary, String subject,int experience)
	{
		super(name,age,id,salary,subject);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}


class Officer extends Employee
{
	String dept;
	
	Officer(String name, int age, int id, double salary,String dept)
	{
		super(name, age, id, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}

public class PersonClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher("Raj",30,101,50000,"English");
		Teacher t2 = new Teacher("Ajay",32,102,60000,"History");
		Teacher t3 = new Teacher("Karan",40,103,45000,"Science");
		
		Principal p1 = new Principal("Sam",55,104,80000,"Maths",20);
		
		Officer o1 = new Officer("Prakash",38,105,70000,"Sales");
		
		Employee x[] = new Employee[5];
		x[0] = t1;
		x[1] = t2;
		x[2] = t3;
		x[3] = p1;
		x[4] = o1;
		
		Employee t;
		for(int i=1;i<x.length;i++)
		{
			for(int j=0;j<x.length-1;j++)
			{
				if(x[j].getAge()>x[j+1].getAge())
				{
					t = x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
		
		System.out.println("Enter lower value of range of age");
		Scanner sc = new Scanner (System.in);
		int lower = sc.nextInt();
		System.out.println("Enter upper value of range of age");
		int upper = sc.nextInt();
		
		for(int j=0;j<x.length;j++)
		{
			if(x[j].getAge()>=lower && x[j].getAge()<=upper)
			{
				System.out.println(x[j]);
			}
		}
		
		
		Employee max = x[0];
		Employee min = x[0];
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i].getSalary()>max.getSalary())
			{
				max = x[i];
				
			}
			if(x[i].getSalary()<min.getSalary())
			{
				min = x[i];	
			}
		}
		
		System.out.println("Employee with highest salary: "+max.name);
		System.out.println(max);
		System.out.println("Employee with lowest salary: "+min.name);
		System.out.println(min);
		
	}

}
