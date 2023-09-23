package com.neebal.exammgmt.services;

import com.neebal.exammgmt.entities.Student;
import com.neebal.exammgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MasterDataService  {

    private List<String> countries;

    private List<Student> students;

    @Autowired
    private StudentRepository studentRepository;

    public MasterDataService(){
        this.countries = Arrays.asList(
                "USA","China","India","Brazil"
        );
    }

    public List<String> getCountries(){
        return this.countries.stream().map(country->country.toUpperCase()).collect(Collectors.toList());
    }


    public Student authenticate(String username, String password){
         List<Student> students  = studentRepository.findAll();
        List<Student> students1 = students
                .stream().filter(student -> student.getUsername().equals(username)
                        && student.getPassword().equals(password)).collect(Collectors.toList());
        if (students1.size()>0){
            return students1.get(0);
        }
        return null;
    }

}
