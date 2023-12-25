package com.nissan.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.nissan.pace.poc.domain.BankAccount;
import com.nissan.pace.poc.domain.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
	
	private BankAccount getBankAccount(String id) {
		log.info("BankAccount resolver id : {}" ,id );
		return BankAccount.builder().id("1").name("Ashok").currency(Currency.USD).build();
		
	}

}
