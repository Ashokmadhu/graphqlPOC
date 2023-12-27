package com.learning.pace.poc.service;

import org.springframework.stereotype.Service;

import com.learning.pace.poc.entity.BankAccount;

@Service
public interface BankAccountService {

	BankAccount findAccountByID(String id);

}
