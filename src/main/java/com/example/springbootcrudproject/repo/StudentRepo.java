package com.example.springbootcrudproject.repo;

import com.example.springbootcrudproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
