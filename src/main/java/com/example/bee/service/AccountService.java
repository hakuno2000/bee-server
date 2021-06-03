package com.example.bee.service;

import com.example.bee.entity.Account;

import java.util.List;

public interface AccountService {
    Account findAccountByPhone(String phone);
    Account login(Account account);
    List<Account> findAll();
    void save(Account account);
}
