package com.inventory.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", fallback = InventoryFallback.class)
public interface ProductClient {
    @GetMapping("/api/products/{productId}/inventory")
    Integer getProductStock(@PathVariable Long productId);
}
