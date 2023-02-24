package com.store.storedeneme.service;

import com.store.storedeneme.dtos.request.AccountRequestDto;
import com.store.storedeneme.dtos.response.AccountResponseDto;
import com.store.storedeneme.mapper.AccountMapper;
import com.store.storedeneme.repository.AccountRepository;
import com.store.storedeneme.service.abstracts.AccountService;
import org.springframework.stereotype.Service;

@Service

public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
        return accountMapper.toDto(accountRepository.save(accountMapper.toEntity(accountRequestDto)));


    }
}
