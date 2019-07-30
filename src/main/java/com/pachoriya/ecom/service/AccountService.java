package com.pachoriya.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pachoriya.ecom.model.Account;
import com.pachoriya.ecom.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository ; 
	
	public List<Account> getAllAccount() {
        return this.accountRepository.findAll();
    }

	public Account getAccountByEmailId(String emailId) {
		return this.accountRepository.findByEmailIdAndIsActive(emailId, true);
	}
}
