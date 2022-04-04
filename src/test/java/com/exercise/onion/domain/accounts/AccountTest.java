package com.exercise.onion.domain.accounts;

import org.junit.jupiter.api.Test;


class AccountTest {

    @Test
    void givenNameWithIncorrectValueThemThowException(){
        Account account = new Account();
        account.validateNameAccount();
    }
}