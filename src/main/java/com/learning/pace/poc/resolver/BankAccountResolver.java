package com.learning.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.BankAccount;
import com.learning.pace.poc.domain.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

	public BankAccount bankAccount(String id) {
		log.info("Fetching data from bank account resolver : {}", id);
		return BankAccount.builder().id("1").currency(Currency.INR).build();

	}

}
