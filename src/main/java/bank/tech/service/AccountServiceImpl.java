package bank.tech.service;

import bank.tech.entity.Accounts;
import bank.tech.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService
{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Accounts getAccountById(Long accountId)
    {
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public Accounts createAccount(Accounts account)
    {
        return accountRepository.save(account);
    }

    @Override
    public Accounts deleteAccount(Long accountId) {
        return null;
    }
}
