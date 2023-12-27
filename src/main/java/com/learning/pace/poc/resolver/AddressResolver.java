package com.learning.pace.poc.resolver;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.pace.poc.dto.AddressDTO;
import com.learning.pace.poc.entity.ClientDetails;
import com.learning.pace.poc.mapper.BankAccountMapper;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AddressResolver implements GraphQLResolver<ClientDetails> {

	@Autowired
	private BankAccountMapper mapper;

	private final ExecutorService executorServie = Executors
			.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

	public CompletableFuture<AddressDTO> address(ClientDetails clientDetails) {
		log.info("Feteching address details from address Resolver id");
		return CompletableFuture.supplyAsync(() -> {
			return  mapper.convertAddressEntityToDTO(clientDetails.getAddress());
		}, executorServie);

	}

}
