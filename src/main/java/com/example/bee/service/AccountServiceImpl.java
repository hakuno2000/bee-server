package com.example.bee.service;

import com.example.bee.entity.Account;
import com.example.bee.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepo accountRepo;

    @Override
    public Account findAccountByPhone(String phone) {
        return accountRepo.findAccountByPhone(phone);
    }

    @Override
    public void save(Account account) {
        accountRepo.save(account);
    }
}