package com.KSRIT.demo.adminRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.KSRIT.demo.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsernameAndPassword(String username, String password);
}
