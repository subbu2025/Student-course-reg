package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.ProRepo;


@Service
public class ProductService {

    @Autowired
    private ProRepo repi; 

    @Autowired
    private PriceClient priceclient; 

    public List<Product> getProductsByCategory(String catageory) { 
        return repi.findByCategory(catageory); 
    }

    public Product addOrUpdateProduct(Product product) {
        return repi.save(product);
    }

    public void deleteProduct(Integer productid) {
        repi.deleteById(productid);
    }

    public Integer getPriceByProductId(Integer productid) {
        return priceclient.getPriceByProductId(productid);
    }

    public Product getProductById(Integer id) {
        return repi.findById(id).orElse(null);
    }
}
