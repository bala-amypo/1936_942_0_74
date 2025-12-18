package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.Sturepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private Sturepo sturepo;

    @Override
    public Stuentity saveStudent(Stuentity student) {
        return sturepo.save(student);
    }
}
