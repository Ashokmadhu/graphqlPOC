package com.learning.pace.poc.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount implements Serializable {

	private static final long serialVersionUID = -1628606063163380791L;
	private String id;
	private ClientDetails clientDetails;
	private Currency currency;

}
