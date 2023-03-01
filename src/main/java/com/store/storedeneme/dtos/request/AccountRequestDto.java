package com.store.storedeneme.dtos.request;

import com.store.storedeneme.model.enums.City;
import com.store.storedeneme.model.enums.Currency;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDto {



    public Long id;

    public Long customerId;

    public Double balance;

    @Enumerated(EnumType.STRING)
    public City city;

    @Enumerated(EnumType.STRING)
    public Currency currency;


}
