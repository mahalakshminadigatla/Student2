package com.example.Student2.controller;

import com.example.Student2.entity.Student;
import com.example.Student2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
        return "Student is added"+student.getName();
}

    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return  this.studentService.getAllStudent();
    }

    @GetMapping("/get/{sId}")
    public Optional<Student> getStudentById(@PathVariable long sId){
        return this.studentService.getStudentById(sId);
    }

    @PutMapping("update/{sId}")
    public String updateStudent(@RequestBody Student student, @PathVariable long sId){
        this.studentService.updateStudent(sId,student);
        return "Student is updated"+sId;
    }

    @DeleteMapping("/delete/{sId}")
    public String deleteStudent(@PathVariable long sId){
        this.studentService.deleteStudent(sId);
        return "Student is deleted"+sId;
    }
}
