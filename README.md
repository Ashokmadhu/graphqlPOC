# graphqlPOC
GraphQlPOC
#To check the voyager endpoint 
http://localhost:8080/voyager

#Properties to be added 

graphql.voyager.enabled=true
graphql.voyager.base-path=/
graphql.voyager.endpoint=/graphql
graphql.voyager.cdn.enabled=false#
graphql.voyager.cdn.version=latest
graphql.voyager.page-title=Voyager

#To check the playground endpoint 
http://localhost:8080/playground

#Properties to be added
graphql.playground.endpoint=/graphql
graphql.playground.subscription-endpoint=/subscriptions
graphql.playground.enabled=true
graphql.playground.page-title=Playground
graphql.playground.cdn.enabled=true
graphql.playground.cdn.version=latest
graphql.playground.static-path.base=/api/vendor/playground/

#Data fetcher uses 
Data fetcher 
1. call multiple services 
2.call another graphql server 
3.call service that returns partial responses

#Persisting the data into db sample data to persist

mutation {
  createBankAccount(input: {
    clientDetails: {
      firstName: "Ashok",
      lastName: "Kumar",
      address: {
        permanentAddress: "123 Main St",
        temporaryAddress: "456 Temp St"
      }
    },
    currency: "INR"
  }) {
    id
    currency
    clientDetails{
      firstName
      lastName
      address{
        temporaryAddress
        permanentAddress
      }
    }
    # Include any other fields you want to retrieve in the response
  }
}

#For quering the saved data in db sample query
query{
  bankAccount(id:"658c34c62c694e281ddc7b8f"){
    currency
    clientDetails{
      firstName
      lastName
      address{
        temporaryAddress
      }
    }
  }
}

# find all bank accounts sample query 

query {
  fetchAllBankAccounts {
    id
    clientDetails {
      firstName
      lastName
    }
    currency
  }
}

#Notes 

This project needs Java 17 , maven , Mongo DB , Mongo DB Compass to be set up in the local machine.

All nested objects will be retrieved in single thread . To overcome that we can use Executorservice . Sample has been given in the Address and Client resolver classes.

Data fetcher will return objects with errors . Sample code has been given in the bank account mutation class.




		 


