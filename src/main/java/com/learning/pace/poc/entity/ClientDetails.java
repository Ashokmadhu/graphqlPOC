package com.learning.pace.poc.entity;

import java.io.Serializable;


public class ClientDetails implements Serializable {
	private static final long serialVersionUID = 849458658074979569L;
	private String firstName;
	private String lastName;
	private Integer age;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
