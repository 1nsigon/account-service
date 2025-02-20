package bank.tech.controller;

import bank.tech.entity.Accounts;
import bank.tech.repo.AccountRepository;
import bank.tech.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    @Autowired
    private AccountServiceImpl accountServiceImpl;


    @GetMapping("/{accountId}")
    public Accounts getAccountById(@PathVariable Long accountId)
    {
        return accountServiceImpl.getAccountById(accountId);
    }

    @PostMapping("/mine")
    public Accounts createAccount(@RequestBody Accounts account) {
        return accountServiceImpl.createAccount(account);
    }



}