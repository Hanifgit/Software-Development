package com.example.day4_radiobutton.Models;


import java.io.Serializable;

public class EmployeeModels implements Serializable {
    private String name;
    private int age;
    private String empType;
    private String dob;
    private String gender;

    public EmployeeModels(String name, int age, String empType, String dob, String gender) {
        this.name = name;
        this.age = age;
        this.empType = empType;
        this.dob = dob;
        this.gender = gender;
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

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
