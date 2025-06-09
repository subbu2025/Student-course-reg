package com.price.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PriceService {

    private static final Logger logger = LoggerFactory.getLogger(PriceService.class);

    @Autowired
    private Prepo priceRepository;

    public Integer getPriceByProductId(Integer productid) {
        logger.info("Fetching price for Product ID: {}", productid);
        
        return priceRepository.findByProductid(productid)
                .map(Pcost::getPrice)
                .orElseThrow(() -> {
                    logger.warn("Price not found for Product ID: {}", productid);
                    return new RuntimeException("Price not found for Product ID: " + productid);
                });
    }

    public Pcost saveOrUpdatePrice(Pcost price) {
        logger.info("Saving or updating price: {}", price);
        return priceRepository.save(price);  
    }

    public void deletePriceByProductId(Integer productid) {
        logger.info("Deleting price for Product ID: {}", productid);
        
        priceRepository.findByProductid(productid)
                .ifPresentOrElse(priceRepository::delete, () -> {
                    logger.warn("No price found for deletion, Product ID: {}", productid);
                });
    }

	public List<Pcost> getAllPrices() {
		
		return null;
	}
}

	