package com.store.storedeneme.controller;

import com.store.storedeneme.dtos.request.AccountRequestDto;
import com.store.storedeneme.dtos.response.AccountResponseDto;
import com.store.storedeneme.service.abstracts.AccountService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/a/user")

public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountResponseDto> createAccount(@RequestBody AccountRequestDto accountRequestDto){
       return ResponseEntity.ok(accountService.createAccount(accountRequestDto));
    }
    @GetMapping
    public ResponseEntity<List<AccountResponseDto>> getAllAccounts(){
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

}
