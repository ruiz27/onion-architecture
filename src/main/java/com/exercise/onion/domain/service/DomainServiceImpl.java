package com.exercise.onion.domain.service;

import org.springframework.stereotype.Service;

@Service
public class DomainServiceImpl implements DomainService {

    private final DomainRepository domainRepository;

    public DomainServiceImpl(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    @Override
    public void sendMessage() {

    }
}
