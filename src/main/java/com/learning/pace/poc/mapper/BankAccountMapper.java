package com.learning.pace.poc.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.learning.pace.poc.dto.AddressDTO;
import com.learning.pace.poc.dto.BankAccountDTO;
import com.learning.pace.poc.dto.ClientDetailsDTO;
import com.learning.pace.poc.entity.Address;
import com.learning.pace.poc.entity.BankAccount;
import com.learning.pace.poc.entity.ClientDetails;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {

	@Mapping(target ="id" , ignore=true)
    BankAccount convertBankInputDTOtoEntity(BankAccountDTO inputDetails);

    ClientDetails convertClientDetailsDTOToEntity(ClientDetailsDTO clientDetailsDTO);

    Address convertAddressDTOToEntity(AddressDTO addressDTO);

	ClientDetailsDTO convertClientDetailsEntityToDTO(ClientDetails clientDetails);

	BankAccountDTO convertBankAccountEntityToDTO(BankAccount account);

	AddressDTO convertAddressEntityToDTO(Address address);

	List<BankAccountDTO> convertListBankAccountEntityToDTO(List<BankAccount> responseList);

}
