package com.KSRIT.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KSRIT.demo.Admin;
import com.KSRIT.demo.adminRepository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepo;

    public Admin login(String username, String password) {
        return adminRepo.findByUsernameAndPassword(username, password);
    }
}