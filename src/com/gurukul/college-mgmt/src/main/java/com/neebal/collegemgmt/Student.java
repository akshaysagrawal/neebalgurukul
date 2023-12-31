package com.neebal.collegemgmt;

public class Student {

    private String username;

    private String password;

    private String country;

    private String gender;

    public Student() {}

    public Student(String username, String password, String country, String gender) {
        this.username = username;
        this.password = password;
        this.country = country;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
