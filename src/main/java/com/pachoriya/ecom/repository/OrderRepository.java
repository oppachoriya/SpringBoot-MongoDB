/**
 * 
 */
package com.pachoriya.ecom.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pachoriya.ecom.model.Order;

/**
 * @author OmPrakashP
 *
 */
public interface OrderRepository extends MongoRepository<Order, Integer> {

	List<Order> findByEmailId(String emailId) ; 
	List<Order> findByProductName(String productName) ; 
	
}
