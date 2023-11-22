package com.example.Student2.service;

import com.example.Student2.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {


     void addStudent(Student student);

     List<Student> getAllStudent();
     Optional<Student> getStudentById(long studentId);
     void updateStudent(long studentId, Student student);

     void deleteStudent(long studentId);
}
