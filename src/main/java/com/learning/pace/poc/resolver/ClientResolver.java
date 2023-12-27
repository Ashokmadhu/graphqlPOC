package com.learning.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.BankAccount;
import com.learning.pace.poc.domain.ClientDetails;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClientResolver implements GraphQLResolver<BankAccount>{
	
	public ClientDetails clientDetails (BankAccount bank) {
		
		log.info("Feteching client details from client Resolver id :{}" ,bank.getId());
		return ClientDetails.builder().firstName("Ashok").lastName("Kumar").build();
		
	}

}
