package com.example.Student2.controller;

import com.example.Student2.entity.Student;
import com.example.Student2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/add")

    public String addStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
        return "Student id added"+student.getName();
}
}
