package com.exercise.onion.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Domain {
    @Id
    private Integer id;
    private String process;

}
