package com.learning.pace.poc.resolver;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.pace.poc.dto.ClientDetailsDTO;
import com.learning.pace.poc.entity.BankAccount;
import com.learning.pace.poc.mapper.BankAccountMapper;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClientResolver implements GraphQLResolver<BankAccount> {

	@Autowired
	private BankAccountMapper mapper;

	private final ExecutorService executorServie = Executors
			.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

	public CompletableFuture<ClientDetailsDTO> clientDetails(BankAccount bank) {

		log.info("checking Thread");

		return CompletableFuture.supplyAsync(() -> {
			log.info("Feteching client details from client Resolver id :{}", bank.getId());
			ClientDetailsDTO client = mapper.convertClientDetailsEntityToDTO(bank.getClientDetails());
			return client;
		}, executorServie);

		// throw new RuntimeException("RunTime Exception");

	}

}
