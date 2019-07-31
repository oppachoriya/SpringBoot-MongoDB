/**
 * 
 */
package com.pachoriya.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.aggregation.StringOperators.Trim;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pachoriya.ecom.model.Inventory;
import com.pachoriya.ecom.model.Order;
import com.pachoriya.ecom.service.OrderService;

/**
 * @author OmPrakashP
 *
 */
@RestController
@RequestMapping("/rest/order")
public class OrderController {
	final OrderService orderService ;

	/**
	 * @param orderService
	 */
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	} 

	@GetMapping("/all")
	public List<Order> listAllOrder( ) {
		try {
			return this.orderService.getAllOrders();
		} catch (Exception e) {
			//Log error
			return new ArrayList<Order>();
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) throws Exception {
		ResponseEntity<Order> result;
		try {
			this.orderService.createOrder(order);
			result = new ResponseEntity<>(order, HttpStatus.OK);
		} catch (Exception e) {
			result = new ResponseEntity<>(order, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}

	@GetMapping("/searchOrderByEmail/emailId{emailId}")
	public List<Order> searchOrderByEmail(@PathVariable String emailId ) {
		try {
			return this.orderService.orderSearchByEmailId(emailId.trim());
		} catch (Exception e) {
			//Log error
			return new ArrayList<Order>();
		}
	}

	@GetMapping("/searchOrderByProductName/productName{productName}")
	public ResponseEntity<Order> searchOrderByProductName(@PathVariable String productName) {
		//To do , this  method can be used for search by product name
		Order order = null; 
		return new ResponseEntity<>(order, HttpStatus.OK);
	}
	

	/**
	 * Few other methods which we can implement 
	 * 1. updateOrderDetails
	 * 2. removeOrder 
	 */

}
