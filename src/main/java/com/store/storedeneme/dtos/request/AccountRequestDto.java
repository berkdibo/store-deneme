package com.store.storedeneme.dtos.request;

import com.store.storedeneme.model.enums.City;
import com.store.storedeneme.model.enums.Currency;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter

public class AccountRequestDto {

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
