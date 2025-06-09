package com.KSRIT.demo.RegistrationRepository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KSRIT.demo.Registration;
import com.KSRIT.demo.Student;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByStudent(Student student);
}