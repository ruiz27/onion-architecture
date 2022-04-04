package com.exercise.onion.infrastructure.db.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserEntity {
    @Id
    private Integer id;
    private String name;
}
