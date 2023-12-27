package com.learning.pace.poc.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDetails implements Serializable {
	private static final long serialVersionUID = 849458658074979569L;
	private String firstName;
	private String lastName;
	private Address address;

}
