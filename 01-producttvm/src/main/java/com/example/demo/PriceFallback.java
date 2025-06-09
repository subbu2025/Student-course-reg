package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class PriceFallback implements PriceClient {
    @Override
    public Integer getPriceByProductId(Integer productId) {
        return (int) Double.NaN;
    }
}
