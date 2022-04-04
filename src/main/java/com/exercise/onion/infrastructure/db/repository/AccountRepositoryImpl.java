package com.exercise.onion.infrastructure.db.repository;

import com.exercise.onion.application.accounts.AccountRepository;
import com.exercise.onion.infrastructure.db.entities.AccountEntity;

public class AccountRepositoryImpl implements AccountRepository {

    R2DBCAccountRepository repository;

    public String saveAccount(){
        repository.save(new AccountEntity());
        return "ok";
    }
}
