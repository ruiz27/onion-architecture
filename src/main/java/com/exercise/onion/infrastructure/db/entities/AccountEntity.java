package com.exercise.onion.infrastructure.db.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AccountEntity {
    @Id
    private Integer id;
    private String process;

}
