package com.exercise.onion.application.accounts;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    // orchestra the business logic with domain.service
    public AccountServiceImpl(AccountRepository accountRepository){
        // inyecta servicio de usuario para validar si el usuario existe
        // inyecta servicio de cuentas para crear la cuenta
        this.accountRepository = accountRepository;
    }

    public String createAccount(){
        // utilizo el servicio de usuarios y valido que exista
        // si existe, utilizo servicio de cuenta, para crear la cuenta
        // retorno el resultado
        accountRepository.saveAccount();
        return null;

    }
}
