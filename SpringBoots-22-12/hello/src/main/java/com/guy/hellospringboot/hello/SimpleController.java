package com.guy.hellospringboot.hello;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @Autowired
  private BankAccountRepository bankAccountRepository;

  @GetMapping("/account")
  public List<BankAccount> getAccount() {
    Iterable<BankAccount> accounts = bankAccountRepository.findAll();
    List<BankAccount> result = new ArrayList<>();
    for (BankAccount acc : accounts) {
      result.add(acc);
    }
    return result;
  }

  @GetMapping("/{id}")
  public BankAccount getAccountbyId(@PathVariable String id) {
    return bankAccountRepository.findById(id).get();
  }

  @PostMapping("/account")
  public BankAccount addAccount(@RequestBody BankAccount bankAccount) {
    return bankAccountRepository.save(bankAccount);
  }

  @PutMapping("/{id}")
  public BankAccount updateAccountById(@PathVariable String id,
      @RequestBody BankAccount bankAccount) {
    BankAccount record = bankAccount;
    record.setAccountNo(id);
    return bankAccountRepository.save(record);
  }

  @DeleteMapping("/{id}")
  public String deleteById(@PathVariable String id) {
    bankAccountRepository.delete(bankAccountRepository.findById(id).get());
    return "deleted";
  }

}
