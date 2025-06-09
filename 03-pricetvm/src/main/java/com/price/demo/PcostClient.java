package com.price.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "price-service", fallback = PcostFallBack.class)
	public interface PcostClient {


	    @GetMapping("/api/prices/{productId}")
	    Double getPriceByProductId(@PathVariable Integer productid);
	}
