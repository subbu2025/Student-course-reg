package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {  

    @Autowired
    private ProductService proser; 

    
    @GetMapping("/category/{category}")
    public String getProductsByCategory(@PathVariable String category, Model model) {
        List<Product> products = proser.getProductsByCategory(category);
        model.addAttribute("products", products);
        model.addAttribute("category", category);
        model.addAttribute("product",new Product());
        return "product";  
    }

    
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "product";  
    }

   
    @PostMapping("/save")
    public String addOrUpdateProduct(@ModelAttribute Product product) {
        proser.addOrUpdateProduct(product);

        
        String category = product.getCategory(); 
        if (category == null || category.isEmpty()) {
            category = "default"; 
        }
        return "redirect:/product/category/" + category;  
    }

   
    @GetMapping("/update/{loginid}")
    public String showUpdateForm(@PathVariable Integer loginid, Model model) {
        Product product = proser.getProductById(loginid);
        if (product == null) {
            return "redirect:/product/category/default"; 
        }
        model.addAttribute("product", product);
        return "product";  
    }

  
    @GetMapping("/delete/{loginid}")
    public String deleteProduct(@PathVariable Integer loginid, 
                                @RequestParam(required = false, defaultValue = "default") String category) {
        proser.deleteProduct(loginid);
        return "redirect:/product/category/" + category;  
    }

   
    @GetMapping("/{productId}/price")
    public String getPriceByProductId(@PathVariable Integer productId, Model model) {
        Integer price = proser.getPriceByProductId(productId);
        model.addAttribute("price", price);
        return "product";  
    }
}
