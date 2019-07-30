package com.pachoriya.ecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pachoriya.ecom.model.Inventory;
import com.pachoriya.ecom.repository.InventoryRepository;

@Service
public class InventoryService {

	final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> getAllInventories() {
        return this.inventoryRepository.findAll();
    }
    
    public Inventory getInventoryByProductName(String productName) {
    	return this.inventoryRepository.findByProductNameAndIsActive(productName, true) ; 
    }
    
    public Inventory updateInventorySold(String productName, int quantity) {
    	Inventory product = this.getInventoryByProductName(productName);
    	product.setUnitSold(product.getUnitSold() + quantity);
    	this.inventoryRepository.save(product) ; 
    	
    	return product ; 
    }

}
