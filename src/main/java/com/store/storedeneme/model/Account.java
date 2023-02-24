package com.store.storedeneme.model;

import com.store.storedeneme.model.enums.City;
import com.store.storedeneme.model.enums.Currency;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode


    public class Account implements Serializable {
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
