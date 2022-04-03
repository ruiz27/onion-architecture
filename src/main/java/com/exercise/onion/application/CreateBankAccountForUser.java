package com.exercise.onion.application;

import com.exercise.onion.domain.service.AccountService;
import com.exercise.onion.domain.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class CreateBankAccountForUser {

    // orchestra the business logic with domain.service
    private final AccountService accountService;
    private final UserService userService;


    public CreateBankAccountForUser(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

    public String createAccount(){
        return null;
    }
}
