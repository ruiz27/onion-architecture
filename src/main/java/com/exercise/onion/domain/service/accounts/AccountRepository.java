package com.exercise.onion.domain.service.accounts;

import com.exercise.onion.domain.entities.Account;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AccountRepository extends R2dbcRepository<Integer, Account> {
}
