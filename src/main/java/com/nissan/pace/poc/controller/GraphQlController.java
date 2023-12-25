package com.nissan.pace.poc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.execution.AsyncExecutionStrategy;
import graphql.schema.GraphQLSchema;

@RestController
public class GraphQlController {
	
	
	private final GraphQL graphQL;
	 
    @Autowired
    public GraphQlController(GraphQLSchema graphQLSchema) {
        this.graphQL = GraphQL.newGraphQL(graphQLSchema)
                .queryExecutionStrategy(new AsyncExecutionStrategy())
                .build();
    }
    
    @PostMapping("/graphql")
    public Map<String, Object> executeQuery(@RequestBody String query) {
        ExecutionResult executionResult = graphQL.execute(query);
        return executionResult.toSpecification();
    }

}
