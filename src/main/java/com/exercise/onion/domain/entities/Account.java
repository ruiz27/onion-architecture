package com.exercise.onion.domain.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Account {
    @Id
    private Integer id;
    private String process;

}