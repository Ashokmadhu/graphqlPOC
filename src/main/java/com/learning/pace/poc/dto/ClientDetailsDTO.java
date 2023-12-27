package com.learning.pace.poc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ClientDetailsDTO implements Serializable {

	private static final long serialVersionUID = 4566484017483664342L;
	
	@NotNull
	private String firstName;
	private String lastName;
	private Integer age;
	private AddressDTO address;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
	
}
