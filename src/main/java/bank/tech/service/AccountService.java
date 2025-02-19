package bank.tech.service;

import bank.tech.entity.Accounts;

public interface AccountService
{
    public Accounts getAccountById(Long accountId);
    Accounts createAccount(Accounts account);
    public Accounts deleteAccount(Long accountId);
}
