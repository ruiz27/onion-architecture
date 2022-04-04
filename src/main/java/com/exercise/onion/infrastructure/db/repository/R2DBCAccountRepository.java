package com.exercise.onion.infrastructure.db.repository;

import com.exercise.onion.infrastructure.db.entities.AccountEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface R2DBCAccountRepository extends R2dbcRepository<AccountEntity, Integer> {
}
