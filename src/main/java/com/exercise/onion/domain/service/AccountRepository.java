package com.exercise.onion.domain.service;

import com.exercise.onion.domain.model.Account;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AccountRepository extends R2dbcRepository<Integer, Account> {
}
