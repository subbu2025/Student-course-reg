package com.KSRIT.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KSRIT.demo.Registration;
import com.KSRIT.demo.Student;
import com.KSRIT.demo.RegistrationRepository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepo;

    public void registerCourse(Registration registration) {
        registration.setRegistrationDate(LocalDate.now());
        registrationRepo.save(registration);
    }

    public List<Registration> getRegistrationsByStudent(Student student) {
        return registrationRepo.findByStudent(student);
    }

    public void deregisterCourse(Long id) {
        registrationRepo.deleteById(id);
    }
}