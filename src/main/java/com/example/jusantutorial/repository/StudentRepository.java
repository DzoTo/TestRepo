package com.example.jusantutorial.repository;

import com.example.jusantutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByName(String name);
    List<Student> findStudentsByAge(int age);
}
