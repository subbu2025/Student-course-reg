package com.inventory.demo;

import org.springframework.stereotype.Component;

@Component
public class InventoryFallback implements ProductClient {
    @Override
    public Integer getProductStock(Long productId) {
        return 0; 
    }
}
