package com.gurukul.day4;

class Employee
{
	private int emp_id;
	private String name,dept;
	private double salary;
	
	Employee()
	{}
	
	Employee(int emp_id,String name,String dept,double salary)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getId()
	{return emp_id;}
	
	public String getName()
	{return name;}
	
	public String getDept()
	{return dept;}
	
	public double getSalary()
	{return salary;}
	
	void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	public String toString()
	{
		return "\nID:"+emp_id+" Name:"+name+" Department:"+dept+" Salary:"+salary;
	}
}


public class ObjAndFunc_Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee a = new Employee(1,"Amar","Sales",50000);
		Employee b = new Employee(2,"Roy","Accounts",40000);
		Employee c = new Employee(3,"Sam","HR",60000);
		
		Employee max = a;
		if(max.getSalary()<b.getSalary())
			max=b;
		if(max.getSalary()<c.getSalary())
			max=c;
		System.out.println(max.getName()+" has highest salary");
		
//		if(a.getSalary()>b.getSalary() && a.getSalary()>c.getSalary())
//		{
//			System.out.println(a.getName()+" has highest salary");
//		}
//		else if(b.getSalary()>a.getSalary() && b.getSalary()>c.getSalary())
//		{
//			System.out.println(b.getName()+" has highest salary");
//		}
//		else
//		{
//			System.out.println(c.getName()+" has highest salary");
//		}
		
		a.setSalary(a.getSalary()+a.getSalary()*20.0/100);
		b.setSalary(b.getSalary()+b.getSalary()*20.0/100);
		c.setSalary(c.getSalary()+c.getSalary()*20.0/100);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
