package com.learning.pace.poc.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.pace.poc.entity.BankAccount;
import com.learning.pace.poc.repository.BankAccountRepository;
import com.learning.pace.poc.service.BankAccountService;

@Component
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository accountRepository;

	@Override
	public BankAccount findAccountByID(String id) {
		Optional<BankAccount> response = accountRepository.findById(id);
		return response.get();
	}

}
