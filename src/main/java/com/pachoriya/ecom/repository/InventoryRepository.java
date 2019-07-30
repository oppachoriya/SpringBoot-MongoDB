/**
 * 
 */
package com.pachoriya.ecom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pachoriya.ecom.model.Inventory;

/**
 * @author OmPrakashP
 *
 */
public interface InventoryRepository extends MongoRepository<Inventory, Integer> {
	Inventory findByProductNameAndIsActive(String productName, Boolean isActive);
}
