package com.learning.pace.poc.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = -8150248630336621393L;
	private String permanentAddress;
	private String temporaryAddress;
	
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	
	

}
