package com.learning.pace.poc.resolver;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.pace.poc.dto.BankAccountDTO;
import com.learning.pace.poc.entity.BankAccount;
import com.learning.pace.poc.mapper.BankAccountMapper;
import com.learning.pace.poc.service.BankAccountService;

import graphql.execution.DataFetcherResult;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.DataFetchingFieldSelectionSet;
import graphql.schema.SelectedField;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

	@Autowired
	private BankAccountService bankAccountService;

	@Autowired
	private BankAccountMapper mapper;

	public DataFetcherResult<BankAccountDTO> bankAccount(String id) {

		BankAccount account = bankAccountService.findAccountByID(id);
		BankAccountDTO responseDTO = mapper.convertBankAccountEntityToDTO(account);
		log.info("Fetching data from bank account resolver : {}", id);
		return DataFetcherResult.<BankAccountDTO>newResult().data(responseDTO)
				// .error(new GenericGraphQLError("Error while calling another service"))
				.build();

	}

	public List<BankAccountDTO> fetchAllBankAccounts(DataFetchingEnvironment env) {
		log.info("Fetching all datas from bank account resolver");
	    env.getSelectionSet().getFields().stream().map(e -> e.getName()).forEach(e ->{
	    	log.info("Printing fields in selection set" ,e );
		});
	    
	    env.getSelectionSet().getFields().stream().map(SelectedField::getName).collect(Collectors.toList());
	    
		List<BankAccount> responseList = bankAccountService.fetchAllBankAccounts();
		List<BankAccountDTO> responseDTO = mapper.convertListBankAccountEntityToDTO(responseList);
		return responseDTO;
	}

}
