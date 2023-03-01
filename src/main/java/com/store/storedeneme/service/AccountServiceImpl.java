package com.store.storedeneme.service;

import com.store.storedeneme.dtos.request.AccountRequestDto;
import com.store.storedeneme.dtos.response.AccountResponseDto;
import com.store.storedeneme.mapper.AccountMapper;
import com.store.storedeneme.repository.AccountRepository;
import com.store.storedeneme.service.abstracts.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;


    @Override
    public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
        return accountMapper.toDto(accountRepository.save(accountMapper.toEntity(accountRequestDto)));
    }

    @Override
    public List<AccountResponseDto> getAllAccounts() {
        return accountMapper.fromEntityToList(accountRepository.findAll());
    }
}
