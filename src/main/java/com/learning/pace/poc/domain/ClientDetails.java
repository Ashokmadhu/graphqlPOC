package com.learning.pace.poc.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientDetails implements Serializable {
	private static final long serialVersionUID = 849458658074979569L;
	private String firstName;
	private String lastName;

}
