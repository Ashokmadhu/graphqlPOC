package com.learning.pace.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.pace.poc.entity.BankAccount;

@Service
public interface BankAccountService {

	BankAccount findAccountByID(String id);

	List<BankAccount> fetchAllBankAccounts();

}
