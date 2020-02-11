package com.developher.demo.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.developher.demo.service.domain.Account;

public interface AccountRepo extends CrudRepository<Account, Integer> {
	 
}
