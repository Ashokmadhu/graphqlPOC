# graphqlPOC
GraphQlPOC

# We need to add graphql kickstart dependency 

    
    <!-- https://mvnrepository.com/artifact/com.graphql-java-kickstart/graphql-spring-boot-starter -->
		<dependency>
			<groupId>com.graphql-java-kickstart</groupId>
			<artifactId>graphql-spring-boot-starter</artifactId>
			<version>15.0.0</version>
		</dependency>

To check the voyager endpoint 
#http://localhost:8080/voyager

#Properties to be added 

graphql.voyager.enabled=true
graphql.voyager.base-path=/
graphql.voyager.endpoint=/graphql
graphql.voyager.cdn.enabled=false
graphql.voyager.cdn.version=latest
graphql.voyager.page-title=Voyager

To check the playground endpoint 
#http://localhost:8080/playground

#Properties to be added
graphql.playground.endpoint=/graphql
graphql.playground.subscription-endpoint=/subscriptions
graphql.playground.enabled=true
graphql.playground.page-title=Playground
graphql.playground.cdn.enabled=true
graphql.playground.cdn.version=latest
graphql.playground.static-path.base=/api/vendor/playground/
