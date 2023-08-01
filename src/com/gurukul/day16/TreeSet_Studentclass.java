package com.gurukul.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
    private String name;
    private int roll_no;
    private int maths;
    private int phy;
    private int chem;
    
    public Student(String name, int roll_no, int maths, int phy, int chem) {
	this.name = name;
	this.roll_no = roll_no;
	this.maths = maths;
	this.phy = phy;
	this.chem = chem;
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRoll_no() {
        return roll_no;
    }


    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }


    public int getMaths() {
        return maths;
    }


    public void setMaths(int maths) {
        this.maths = maths;
    }


    public int getPhy() {
        return phy;
    }


    public void setPhy(int phy) {
        this.phy = phy;
    }


    public int getChem() {
        return chem;
    }


    public void setChem(int chem) {
        this.chem = chem;
    }


    public String toString() {
	return "\nStudent name= "+name+" roll no= "+roll_no+" maths= "+maths+" phy= "+phy+" chem= "+chem;
    }
    
    @Override
    public int compareTo(Student o) {
	// TODO Auto-generated method stub
	
	return this.roll_no-o.roll_no;
    }
    
    //alternate method
//    public boolean isFail(int subject) {
//	return subject<35;
//    }
 
}

public class TreeSet_Studentclass {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Student s1 = new Student("ram",1,22,50,60);
	Student s2 = new Student("arun",2,23,20,60);
	Student s3 = new Student("sam",3,25,30,25);
	Student s4 = new Student("mohan",4,29,40,60);
	Student s5 = new Student("jatin",5,21,28,10);
	Student s6 = new Student("karan",6,20,12,60);
	
	List<Student> mathsList = new ArrayList<>();
	mathsList.add(s1);
	mathsList.add(s2);
	mathsList.add(s3);
	mathsList.add(s4);
	mathsList.add(s5);
	mathsList.add(s6);
	
	List<Student> phyList = new ArrayList<>();
	phyList.add(s2);
	phyList.add(s3);
	phyList.add(s5);
	phyList.add(s6);
	
	List<Student> chemList = new ArrayList<>();
	chemList.add(s3);
	chemList.add(s5);
	
	TreeSet <Student> tree1 = new TreeSet<>();
	TreeSet <Student> tree2 = new TreeSet<>();
	TreeSet <Student> tree3 = new TreeSet<>();
	
	tree1.addAll(mathsList);
	tree2.addAll(phyList);
	tree3.addAll(chemList);
	
	tree1.retainAll(tree2);
	tree1.retainAll(tree3);
	System.out.println(tree1);
	
	
	//Alternate method
	
//	Student s1 = new Student("A", 00, 75, 90, 70);
//	Student s2 = new Student("B", 01, 35, 30, 10); //math,phy,chem
//	Student s3 = new Student("C", 02, 25, 40, 70); //math,phy
//	Student s4 = new Student("D", 03, 15, 10, 20); //math,phy,chem
//	Student s5 = new Student("E", 04, 75, 30, 20); //phy,chem
//	Student [] studentArray = {s1,s2,s3,s4,s5};
//	
//	ArrayList<Student> studentMathFailed = new ArrayList<Student>();
//	ArrayList<Student> studentPhyFailed = new ArrayList<Student>();
//	ArrayList<Student> studentChemFailed = new ArrayList<Student>();
//	
//	for(Student s:studentArray) {
//		if(s.isFail(s.getMath()))
//			studentMathFailed.add(s);
//	}
//	
////	ArrayList<Student> studentPhyFailed = new ArrayList<Student>();
//	for(Student s:studentArray) {
//		if(s.isFail(s.getPhy()))
//			studentPhyFailed.add(s);
//	}
//	
////	ArrayList<Student> studentChemFailed = new ArrayList<Student>();
//	for(Student s:studentArray) {
//		if(s.isFail(s.getChem()))
//			studentChemFailed.add(s);
//	}
//
////	
////	 for(Student s:studentMathFailed) {
////            System.out.println(s.getName());
////        }
////	 System.out.println();
////	 for(Student s:studentPhyFailed) {
////            System.out.println(s.getName());
////        }
////	 System.out.println();
////	   for(Student s:studentChemFailed) {
////            System.out.println(s.getName());
////        }
//	
//	HashSet<Student> set1 = new HashSet<Student>();
//	
//	HashSet<Student> set2 = new HashSet<Student>();
//	HashSet<Student> set3 = new HashSet<Student>();
//	set1.addAll(studentMathFailed);
//	set2.addAll(studentPhyFailed);
//	set3.addAll(studentChemFailed);
//	
//	  set1.retainAll(set2);
//	  set1.retainAll(set3);
//
//	
//
//	System.out.println(set1);
	
    }

}
