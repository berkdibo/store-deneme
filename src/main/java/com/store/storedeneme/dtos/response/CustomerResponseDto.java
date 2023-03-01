package com.store.storedeneme.dtos.response;

import com.store.storedeneme.model.enums.City;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
        @Builder
public class CustomerResponseDto {

    public Long id;

    public String name;

    @Enumerated
    public City city;

    public LocalDate birthDate;
}
