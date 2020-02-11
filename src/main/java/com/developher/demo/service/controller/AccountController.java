package com.developher.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.developher.demo.service.domain.Account;
import com.developher.demo.service.dao.AccountRepo;

@CrossOrigin
@RestController
@RequestMapping(path = "/develop-her/account")
public class AccountController {
	
	@Autowired
	private AccountRepo accountRepo;
	
	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public Account registerAccount (@RequestBody Account account) {
		return accountRepo.save(account);
	}
	
	@GetMapping(path = "/all")
	public Iterable<Account> retrieveAllAccounts() {
		 return accountRepo.findAll();
	}
	
}
