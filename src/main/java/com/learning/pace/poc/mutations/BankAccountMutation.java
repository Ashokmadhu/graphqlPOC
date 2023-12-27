package com.learning.pace.poc.mutations;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.pace.poc.dto.BankAccountDTO;
import com.learning.pace.poc.entity.BankAccount;
import com.learning.pace.poc.mapper.BankAccountMapper;
import com.learning.pace.poc.repository.BankAccountRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@AllArgsConstructor
public class BankAccountMutation  implements GraphQLMutationResolver{
	
	
	private final BankAccountRepository bankAccountRepository;
	private final BankAccountMapper bankAccountMapper;
	
	public BankAccountDTO createBankAccount(@RequestBody BankAccountDTO input) {
		log.info("Entering into mutation class to save bank account object");
		BankAccount accountDetails = bankAccountMapper.convertBankInputDTOtoEntity(input);
		BankAccount persistedEntity = bankAccountRepository.save(accountDetails);
		BankAccountDTO responseDTO = bankAccountMapper.convertBankAccountEntityToDTO(persistedEntity);
		return responseDTO;
	}
	
	public UUID uploadFile(DataFetchingEnvironment env) {
		
		return UUID.randomUUID();
		
	}

}
