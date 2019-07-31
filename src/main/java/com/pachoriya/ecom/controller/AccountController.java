package com.pachoriya.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pachoriya.ecom.model.Account;
import com.pachoriya.ecom.service.AccountService;

@RestController
@RequestMapping("/rest/account")
public class AccountController {

	final AccountService accountService;

	/**
	 * 
	 * @param accountService
	 */
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("all")
	public List<Account> listAllAccounts( ) {
		try {
			return this.accountService.getAllAccount();
		} catch (Exception e) {
			//Log error
			return new ArrayList<Account>();
		}
	}
	
	/**
	 * Few other methods which we can implement 
	 * 1. updateAccountDetails
	 * 2. removeAccount
	 * 3. validationAccount
	 * 4. searchAccount 
	 */
}
