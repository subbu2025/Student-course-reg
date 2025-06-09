package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class  CatFallBack implements CataClient {
    @Override
    public List<Catageory> getProductsByCategory(String category) {
        return new ArrayList<>(); // Return empty list if product service is down
    }
}



