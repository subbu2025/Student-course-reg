package com.example.demo;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategorySer {

    @Autowired
    private RepoCat categoryRepository;

    public List<Catageory> getAllCatageories() {
        return categoryRepository.findAll();
    }

    public void addOrUpdateCatageory(Catageory category) {  
        categoryRepository.save(category);
    }

    public void deleteCatageory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

  
	
	}

