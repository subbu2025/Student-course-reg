package com.KSRIT.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KSRIT.demo.Student;
import com.KSRIT.demo.StudentRepository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public Student login(String email, String password) {
        return studentRepo.findByEmailAndPassword(email, password);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }
}
