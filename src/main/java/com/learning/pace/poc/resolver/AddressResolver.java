package com.learning.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.Address;
import com.learning.pace.poc.domain.ClientDetails;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class AddressResolver implements GraphQLResolver<ClientDetails> {

	public Address address(ClientDetails clientDetails) {

		log.info("Feteching address details from address Resolver id");
		
		return Address.builder().permanentAddress("Kallakurichi").temporaryAddress("Chennai").build();
	}

}
