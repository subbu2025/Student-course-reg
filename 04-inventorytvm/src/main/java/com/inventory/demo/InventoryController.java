package com.inventory.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller  
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    
    @GetMapping("/{productId}")
    public ModelAndView getStock(@PathVariable Long productId) {
        ModelAndView mav = new ModelAndView("inventory"); 
        mav.addObject("stock", inventoryService.getStockByProductId(productId));
        return mav;
    }

   
    @PostMapping("/update")
    public String saveOrUpdateStock(@ModelAttribute Inventory inventory, RedirectAttributes redirectAttributes) {
        Inventory savedInventory = inventoryService.saveOrUpdateStock(inventory);
        redirectAttributes.addFlashAttribute("message", "Stock updated successfully!");
        return "redirect:/inventory/list"; 
    }

  
    @GetMapping("/delete/{productId}")
    public String deleteStock(@PathVariable Long productId, RedirectAttributes redirectAttributes) {
        inventoryService.deleteStockByProductId(productId);
        redirectAttributes.addFlashAttribute("message", "Stock deleted successfully!");
        return "redirect:/inventory/list";
    }

    @GetMapping("/list")
    public ModelAndView showInventoryList() {
        ModelAndView mav = new ModelAndView("inventoryList"); 
        mav.addObject("inventoryList", inventoryService.getAllInventory());
        return mav;
    }
}
