package com.price.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Controller
@RequestMapping("/prices")
public class PrestController { 

    private static final Logger logger = LoggerFactory.getLogger(PrestController.class);

    @Autowired
    private PriceService priceService;

    
    @GetMapping("/all")
    public String getAllPrices(Model model) {
        List<Pcost> prices = priceService.getAllPrices();  
        model.addAttribute("prices", prices);  
        model.addAttribute("pcost", new Pcost()); 
        return "prices";  
    }

   
    @GetMapping("/{productId}")
    public String getPriceByProductId(@PathVariable Integer productId, Model model) {
        try {
            logger.info("Fetching price for Product ID: {}", productId);
            Integer price = priceService.getPriceByProductId(productId);
            model.addAttribute("pcost", price);
        } catch (RuntimeException e) {
            logger.error("Error fetching price: {}", e.getMessage());
            model.addAttribute("errorMessage", "Error fetching price: " + e.getMessage());
        }
        return "prices"; 
    }
    

    
    @PostMapping("/save")
    public String saveOrUpdatePrice(@ModelAttribute Pcost pcost) {
        logger.info("Saving/updating price: {}", pcost);
        priceService.saveOrUpdatePrice(pcost);
        return "redirect:/prices";  
    }

    
    @PostMapping("/delete/{productId}")
    public String deletePriceByProductId(@PathVariable Integer productId) {
        logger.info("Deleting price for Product ID: {}", productId);
        priceService.deletePriceByProductId(productId);
        return "redirect:/prices";  
    }
}
