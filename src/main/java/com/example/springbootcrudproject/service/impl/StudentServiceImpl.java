package com.example.springbootcrudproject.service.impl;

import com.example.springbootcrudproject.entity.Student;
import com.example.springbootcrudproject.repo.StudentRepo;
import com.example.springbootcrudproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public void insertStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudentById(Student student, int id) {
        Student studentFromDb  = studentRepo.findById(id).get();

        studentFromDb.setName(student.getName());
        studentFromDb.setAge(student.getAge());
        studentFromDb.setAddress(student.getAddress());
        studentFromDb.setFatherName(student.getFatherName());
        return studentRepo.save(studentFromDb);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepo.deleteById(id);

    }
}
