package com.exercise.onion.infrastructure.data;

import com.exercise.onion.domain.model.Domain;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ElasticRepository extends R2dbcRepository<Integer, Domain> {
}
