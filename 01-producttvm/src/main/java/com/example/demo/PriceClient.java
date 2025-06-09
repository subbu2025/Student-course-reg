package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "price-service", fallback = PriceFallback.class)
	public interface PriceClient {
	    @GetMapping("/api/prices/{productId}")
	    Integer getPriceByProductId(@PathVariable Integer productid);
	}



