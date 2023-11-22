package com.example.Student2.service;

import com.example.Student2.entity.Student;
import com.example.Student2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// StudentServiceImpl.java
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;


//    private final StudentRepo studentRepo;

//    @Autowired
//    public StudentServiceImpl(StudentRepo studentRepository) {
//        this.studentRepo = studentRepository;
//    }

    @Override
    public void addStudent( Student student) {
       studentRepo.save(student);

    }
}

