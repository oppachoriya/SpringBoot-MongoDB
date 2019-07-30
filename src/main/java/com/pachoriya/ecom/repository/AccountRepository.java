/**
 * 
 */
package com.pachoriya.ecom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pachoriya.ecom.model.Account;

/**
 * @author OmPrakashP
 *
 */
public interface AccountRepository extends MongoRepository<Account, Integer> {
	Account findByEmailIdAndIsActive(String emailId, Boolean isActive) ;  
}
