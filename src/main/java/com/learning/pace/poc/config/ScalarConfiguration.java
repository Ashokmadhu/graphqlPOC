package com.learning.pace.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class ScalarConfiguration {
	
	@Bean
	public GraphQLScalarType nonNegativeInt() {
		return ExtendedScalars.NonNegativeInt;
	}

}
