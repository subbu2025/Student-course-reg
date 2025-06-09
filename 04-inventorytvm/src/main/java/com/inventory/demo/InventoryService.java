package com.inventory.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.demo.Inventory;
import com.inventory.demo.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Integer getStockByProductId(Long productId) {
        Inventory inventory = inventoryRepository.findByProductId(productId).orElse(null);
        if (inventory != null) {
            return inventory.getStock();
        }
        return 0;
    }


    public Inventory saveOrUpdateStock(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public void deleteStockByProductId(Long productId) {
        inventoryRepository.findByProductId(productId).ifPresent(inventoryRepository::delete);
    }


	public Object getAllInventory() {
		
		return null;
	}
}
