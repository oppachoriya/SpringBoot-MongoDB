package com.pachoriya.ecom.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Null;

import org.springframework.stereotype.Service;

import com.pachoriya.ecom.model.Account;
import com.pachoriya.ecom.model.Inventory;
import com.pachoriya.ecom.model.Order;
import com.pachoriya.ecom.repository.OrderRepository;

@Service
public class OrderService {
	final OrderRepository orderRepository;
	final AccountService accountService;
	final InventoryService inventoryService;
	private String[] paymentType  ;
	/**
	 * 
	 * @param orderRepository
	 * @param inventoryService
	 * @param accountService
	 */
    public OrderService(OrderRepository orderRepository, InventoryService inventoryService, AccountService accountService) {
		this.orderRepository = orderRepository ; 
		this.inventoryService = inventoryService ;
		this.accountService = accountService ; 	
		this.paymentType = new String[] {"cash", "online","card","coupon", "other"};
	}

    /**
     * List all orders
     * @return
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
    /**
     * List order by users emailId
     * @param emailId
     * @return
     */
    public List<Order> orderSearchByEmailId(String emailId) {
    	return orderRepository.findByEmailId(emailId) ; 
    }
    
    /**
     * List order by product name
     * @param productName
     * @return
     */
    public List<Order> orderSearchByProductName(String productName) {
    	return orderRepository.findByProductName(productName); 
    }
    /**
     * @apiNote Create new order
     * 
     * @param order
     * @return
     * @throws Exception
     */
    public Order createOrder(Order order) throws Exception {
    	order.setIsActive(true);
    	order.setInsertDate(new Date());
    	Boolean validation = this.validateOrder(order) ; 
    	if(validation) {
    		Order newOrder =  this.orderRepository.save(order) ; 
    		this.inventoryService.updateInventorySold(order.getProductName(), order.getQuanity()) ; 
    		return newOrder ;
    	} else {
    		throw new Exception("Unable to place order, validation fail") ; 
    	}
    }
    
    /**
     * @apiNote This method can be used for validation of Order
     * @param order
     * @return
     */
    public Boolean validateOrder(Order order) {
    	Boolean isValid = true ; 
    	if(isValid &&  (order.getProductName() =="" || order.getProductName().length() < 1)) {
    		isValid = false ; 
    	}
    	
    	if(isValid && (order.getAmount() <= 0)) {
    		isValid = false ; 
    	}
    	
    	List<String> paymentlist = Arrays.asList(this.paymentType);
        
    	if(isValid && !paymentlist.contains(order.getPaymentType().toLowerCase())) {
    		isValid = false ; 
    	}
    	
    	if(isValid && order.getQuanity() < 1) {
    		isValid = false ; 
    	}
    	
    	Account purchaser = this.accountService.getAccountByEmailId(order.getEmailId()) ; 
    	if(isValid && !(purchaser instanceof Account)) {
    		isValid = false ; 
    	}
    	
    	
    	Inventory product = this.inventoryService.getInventoryByProductName(order.getProductName()) ; 
    	if(isValid && !(product instanceof Inventory)) {
    		isValid = false ; 
    	}
    	
    	if(isValid && !(order.getQuanity() <= (product.getUnitPurchased() - product.getUnitSold()))) {
    		isValid = false ; 
    	}
    	return isValid ; 
    }
}
