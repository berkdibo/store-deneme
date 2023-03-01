package com.store.storedeneme.mapper;

import com.store.storedeneme.dtos.request.AccountRequestDto;
import com.store.storedeneme.dtos.response.AccountResponseDto;
import com.store.storedeneme.model.Account;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toEntity(AccountRequestDto accountRequestDto);

    AccountResponseDto toDto(Account account);

    List<AccountResponseDto> fromEntityToList (List<Account> accountList);

}