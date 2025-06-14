package com.KSRIT.demo.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KSRIT.demo.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmailAndPassword(String email, String password);
}