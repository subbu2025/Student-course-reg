package com.example.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class ProductUIController {

    @Autowired
    private RestTemplate restTemplate; 

    @GetMapping("/products")
    public String getProducts(@RequestParam String category, Model model) {
        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/product")
                .pathSegment(category)
                .toUriString();

        Product[] products = restTemplate.getForObject(url, Product[].class);
        
        model.addAttribute("products", products);
        return "product-list"; 
    }
}
