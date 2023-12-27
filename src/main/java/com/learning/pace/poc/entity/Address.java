package com.learning.pace.poc.entity;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = -3876919140335089103L;
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
