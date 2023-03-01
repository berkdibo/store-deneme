package com.store.storedeneme.dtos.response;

import com.store.storedeneme.model.enums.City;
import com.store.storedeneme.model.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDto {

    private Long id;

    private Long customerId;

    private Double balance;

    @Enumerated
    private City city;

    @Enumerated
    private Currency currency;
}
