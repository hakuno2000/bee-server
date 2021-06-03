package com.example.bee.service;

import com.example.bee.entity.Account;

public interface AccountService {
    Account findAccountByPhone(String phone);
    Account login(Account account);
    void save(Account account);
}
