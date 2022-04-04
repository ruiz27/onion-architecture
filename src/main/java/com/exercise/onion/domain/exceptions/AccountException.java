package com.exercise.onion.domain.exceptions;

public class AccountException extends RuntimeException {

    public AccountException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public AccountException(String fail) {
    }
}
