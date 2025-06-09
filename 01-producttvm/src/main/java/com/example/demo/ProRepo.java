package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface ProRepo extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
