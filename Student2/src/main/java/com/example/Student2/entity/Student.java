package com.example.Student2.entity;

import org.springframework.data.annotation.Id;

public class Student {
    public Student(int studentId, String name, int age, int salary) {
        super();
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Student() {

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

    public int getSalary() {
        return salary;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
    private int studentId;
    private String name;
    private int age;
    private int salary;
}
