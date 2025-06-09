package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {  
@Autowired	
private CategorySer categoryService;  

   

    
    
    @GetMapping("/all")
    public String getAllCategories(Model model) {
       List<Catageory> categories = categoryService.getAllCatageories();
        model.addAttribute("categories", categories);
        model.addAttribute("category", new Catageory());
        return "categories";  
    }

    
    @PostMapping("/add")
    public String addCategory(@ModelAttribute Catageory category) {
        categoryService.addOrUpdateCatageory(category);
        return "redirect:/categories/all";
    }

  
    @PostMapping("/update")
    public String updateCategory(@ModelAttribute Catageory category) {
        categoryService.addOrUpdateCatageory(category);
        return "redirect:/categories/all";
    }

   
    @PostMapping("/delete")
    public String deleteCategory(@RequestParam Long id) {
        categoryService.deleteCatageory(id);
        return "redirect:/categories/all";
    }
}
