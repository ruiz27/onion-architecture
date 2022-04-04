package com.exercise.onion.domain.accounts;


import com.exercise.onion.domain.exceptions.AccountException;


public class Account {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String validateNameAccount(){
        if(name.contains("$")){
            throw new AccountException("fail");
        }
        return "ok";
    }

}
