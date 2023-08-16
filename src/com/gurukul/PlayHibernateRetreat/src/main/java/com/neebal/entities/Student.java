package com.neebal.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person{


    @Column(nullable = true)
    private Integer rollno;

    @OneToMany(mappedBy = "student")
    private Set<BookStudent> booksIssued;

    @OneToMany(mappedBy = "student")
    private  Set<StudentExam> studentExamSet;

    public Student() {
    }

    public Student(String name, Character gender,Integer rollno) {
        super(name,gender);
        this.rollno = rollno;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public Set<BookStudent> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Set<BookStudent> booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Set<StudentExam> getStudentExamSet() {
        return studentExamSet;
    }

    public void setStudentExamSet(Set<StudentExam> studentExamSet) {
        this.studentExamSet = studentExamSet;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", rollno=" + rollno +
                '}';
    }
}
