package com.learning.pace.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.pace.poc.domain.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Integer> {

}
