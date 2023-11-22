package com.example.Student2.service;

import com.example.Student2.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    void addStudent(Student student);
}
