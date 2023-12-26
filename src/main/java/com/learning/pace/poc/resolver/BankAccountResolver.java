package com.learning.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.BankAccount;
import com.learning.pace.poc.domain.ClientDetails;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

	public BankAccount bankAccount(String id) {
		log.info("BankAccount resolver id : {}", id);
		return BankAccount.builder().id("1")
				.clientDetails(ClientDetails.builder().firstName("Ashok").lastName("Kumar").build()).build();

	}

}
