package com.example.bee.controller;

import com.example.bee.entity.Account;
import com.example.bee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

//    @GetMapping("")
//    public String trySomething() {
//        return "Hello World";
//    }

    @GetMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Account account) {
        Account matchedAccount = accountService.findAccountByPhone(account.getPhone());
        if (matchedAccount == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(matchedAccount);
    }
}
