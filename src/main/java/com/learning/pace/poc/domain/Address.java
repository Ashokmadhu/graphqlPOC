package com.learning.pace.poc.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address implements Serializable {
	
	private static final long serialVersionUID = -3876919140335089103L;
	private String permanentAddress;
	private String temporaryAddress;
	

}
