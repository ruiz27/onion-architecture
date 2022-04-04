package com.exercise.onion.application;

import org.springframework.stereotype.Service;

@Service
public class CreateBankAccountServiceImpl implements CreateBankAccountService{

    // orchestra the business logic with domain.service
    public CreateBankAccountServiceImpl(){
        // inyecta servicio de usuario para validar si el usuario existe
        // inyecta servicio de cuentas para crear la cuenta
    }


    public String createAccount(){
       // utilizo el servicio de usuarios y valido que exista
       // si existe, utilizo servicio de cuenta, para crear la cuenta
       // retorno el resultado
        return null;

    }
}
