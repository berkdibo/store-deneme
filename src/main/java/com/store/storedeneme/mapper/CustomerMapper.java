package com.store.storedeneme.mapper;

import com.store.storedeneme.dtos.request.CustomerRequestDto;
import com.store.storedeneme.model.Customer;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer map(CustomerRequestDto customerRequestDto);
    CustomerRequestDto map(Customer customer);

}
