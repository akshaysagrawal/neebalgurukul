package com.gurukul.day8.homework;

import java.util.*;

//Developed by Rupendra and Akshay


class Courses
{
	String Cid;
	String CName;
	int Csem;
	
	Courses(){}
	
	Courses(String Cid, String CName, int Csem)
	{
		this.Cid=Cid;
		this.CName=CName;
		this.Csem=Csem;
	}

	public String getCid() {
		return Cid;
	}

	public void setCid(String cid) {
		Cid = cid;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public int getCsem() {
		return Csem;
	}

	public void setCsem(int csem) {
		Csem = csem;
	}
	
	public String toString()
	{
		return "Course Id:"+Cid+" Course Name:"+CName+" Semester:"+Csem+"\n1";
	}
	
}

class StudentClass
{
	String Sid;
	String SName;
	ArrayList <Courses> coursesList= new ArrayList<Courses>();
	
	StudentClass(){}
	
	StudentClass(String Sid,String SName)
	{
		this.Sid = Sid;
		this.SName=SName;
		
	}

	public String getSid() {
		return Sid;
	}

	public void setSid(String sid) {
		this.Sid = sid;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public ArrayList<Courses> getCoursesList() {
		return coursesList;
	}

	public void setCourses(Courses c) {
		this.coursesList.add(c);
	}
	
	public String toString()
	{
		return "Student Id:"+Sid+" Student Name:"+SName+ " Course List:"+coursesList;
	}
}

public class StudentRoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentClass> studentList=new ArrayList<StudentClass>();
		Scanner sc = new Scanner(System.in);
		boolean ex = true;
	do
	{
		System.out.println("press 1 to add a new student");
		System.out.println("Press 2 to enroll the student in the course");
		System.out.println("press 3 to display the list of cources a student has enrolled");
		System.out.println("press 4 to display the list of all students along with courses");
		System.out.println("press 5 to Remove the student");
		System.out.println("press 0 to Exit");
		int x = sc.nextInt();

		switch(x)
		{
		case 1:
			System.out.println("Enter the Students Name and student Id");
			StudentClass stud = new StudentClass();
			sc.nextLine();
			String sname=sc.nextLine();
			String sid=sc.nextLine();
			stud.setSName(sname);
			stud.setSid(sid);
			System.out.println("set the id: "+stud.Sid);
			studentList.add(stud);
			break;
		case 2:
			boolean flag = false;
			Courses it = new Courses();
			System.out.println("Enter the course ID,name and semester");
			it.setCid(sc.next());
			it.setCName(sc.next());
			int n=sc.nextInt();
			it.setCsem(n);
			
			//sc.nextLine();
			System.out.println("Enter the student ID");
			String id=sc.next();
			for(int j=0;j<studentList.size();j++) 
			{
				if(studentList.get(j).getSid().equals(id))
				{
					studentList.get(j).setCourses(it);
					flag = true;
				}
			}
			if(flag == false)
			{
				System.out.println("The student id does not match");	
			}
			break;
		case 3:
			System.out.println("Enter the student ID");
			String id1=sc.next();
			for(int j=0;j<studentList.size();j++) 
			{
				if(studentList.get(j).getSid().equals(id1))
				{
					System.out.println(studentList.get(j));
				}
			}
			break;
		case 4:
			System.out.println("List of all Students: ");
			for(int j=0;j<studentList.size();j++) 
			{
					System.out.println(studentList.get(j));
			}
			break;
		case 5:
			System.out.println("Enter the student ID to remove student");
			String id2=sc.next();
			for(int j=0;j<studentList.size();j++) 
			{
				if(studentList.get(j).getSid().equals(id2))
				{
					System.out.println(studentList.remove(j));
				}
			}
			System.out.println("Student removed successfully");
			break;	
		case 0:
			ex = false;
			break;
		}
	}while(ex==true);
	}
}
