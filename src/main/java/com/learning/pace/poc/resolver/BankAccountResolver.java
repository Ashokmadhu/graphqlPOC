package com.learning.pace.poc.resolver;

import org.springframework.stereotype.Component;

import com.learning.pace.poc.domain.BankAccount;
import com.learning.pace.poc.domain.Currency;

import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

	public DataFetcherResult<BankAccount> bankAccount(String id) {

		/*
		 * Data fetecher 1. call multiple services 2.call another graphql server 3.call
		 * service that returns partial responses
		 */
		log.info("Fetching data from bank account resolver : {}", id);
		return DataFetcherResult.<BankAccount>newResult()
				.data(BankAccount.builder().id("1").currency(Currency.INR).build())
				.error(new GenericGraphQLError("Error while calling another service")).build();

	}

}
