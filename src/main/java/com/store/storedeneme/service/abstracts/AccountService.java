package com.store.storedeneme.service.abstracts;

import com.store.storedeneme.dtos.request.AccountRequestDto;
import com.store.storedeneme.dtos.response.AccountResponseDto;

import java.util.List;

public interface AccountService {

    AccountResponseDto createAccount(AccountRequestDto accountRequestDto);

    List<AccountResponseDto> getAllAccounts();


    }

