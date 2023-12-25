package com.nissan.pace.poc.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
public class BankAccount {
	
  private String id;
  
  private String name;
  
  private Currency currency;

}
