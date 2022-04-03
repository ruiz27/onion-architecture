package com.exercise.onion.domain.service;

import com.exercise.onion.domain.model.Domain;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface DomainRepository extends R2dbcRepository<Integer, Domain> {
}
