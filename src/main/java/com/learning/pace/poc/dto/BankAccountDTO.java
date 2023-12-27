package com.learning.pace.poc.dto;

import java.io.Serializable;

import lombok.Data;

public class BankAccountDTO implements Serializable {
	private static final long serialVersionUID = 7415956469847879379L;
	private String id;
	private ClientDetailsDTO clientDetails;
	private String currency;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ClientDetailsDTO getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(ClientDetailsDTO clientDetails) {
		this.clientDetails = clientDetails;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
