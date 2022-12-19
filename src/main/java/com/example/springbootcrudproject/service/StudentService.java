package com.example.springbootcrudproject.service;


import com.example.springbootcrudproject.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    void insertStudent(Student student);

    Student getStudentById(int id );

    List<Student> getAllStudents();

   Student updateStudentById(Student student , int id);

   void deleteStudentById(int id);
}
