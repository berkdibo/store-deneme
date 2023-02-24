package com.store.storedeneme.dtos.response;

import com.store.storedeneme.model.enums.City;
import com.store.storedeneme.model.enums.Currency;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AccountResponseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private Double balance;

    @Enumerated
    private City city;

    @Enumerated
    private Currency currency;
}
