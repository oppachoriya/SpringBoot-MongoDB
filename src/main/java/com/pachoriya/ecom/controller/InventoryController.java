/**
 * 
 */
package com.pachoriya.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pachoriya.ecom.model.Inventory;
import com.pachoriya.ecom.service.InventoryService;

/**
 * @author OmPrakashP
 *
 */

@RestController
@RequestMapping("/rest/inventory")
public class InventoryController {

	final InventoryService inventoryService;

	/**
	 * @param inventoryService 
	 */
	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService ; 
	}

	@GetMapping("all")
	public List<Inventory> listAllInventory( ) {
		try {
			return this.inventoryService.getAllInventories();
		} catch (Exception e) {
			//Log error
			return new ArrayList<Inventory>();
		}
	}
	

	/**
	 * Few other methods which we can implement 
	 * 1. updateInventoryDetails
	 * 2. removeInventory
	 * 3. validationInventory
	 */
}
