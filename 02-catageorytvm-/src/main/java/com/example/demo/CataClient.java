package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", fallback = CatFallBack.class)
	public interface CataClient {
	    @GetMapping("/api/products/category/{category}")
	    List<Catageory> getProductsByCategory(@PathVariable String category);
	}

