package com.learning.pace.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learning.pace.poc.domain.BankAccount;

@Repository
public interface BankAccountRepository extends MongoRepository<BankAccount,Integer> {

}
