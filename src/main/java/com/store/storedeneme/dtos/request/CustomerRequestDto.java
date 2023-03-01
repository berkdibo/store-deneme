package com.store.storedeneme.dtos.request;

import com.store.storedeneme.model.enums.City;

import javax.persistence.Enumerated;
import java.time.LocalDate;

public class CustomerRequestDto {

    public Long id;

    public String name;

    @Enumerated
    public City city;

    public LocalDate birthDate;
}
