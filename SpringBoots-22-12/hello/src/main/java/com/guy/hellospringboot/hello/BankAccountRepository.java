package com.guy.hellospringboot.hello;

import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, String> {

}
