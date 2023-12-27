package com.learning.pace.poc.resolver;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.BankAccount;
import com.learning.pace.poc.domain.ClientDetails;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClientResolver implements GraphQLResolver<BankAccount>{
	
	private final ExecutorService executorServie = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
			);
	
	public CompletableFuture<ClientDetails> clientDetails (BankAccount bank) {
		
		log.info("checking Thread");
		
		return CompletableFuture.supplyAsync(
				()->{
					log.info("Feteching client details from client Resolver id :{}" ,bank.getId());
					return ClientDetails.builder().firstName("Ashok").lastName("Kumar").build();
				},executorServie);
		
		//throw new RuntimeException("RunTime Exception");
		
	}

}
