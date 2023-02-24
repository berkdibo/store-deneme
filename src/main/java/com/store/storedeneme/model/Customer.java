package com.store.storedeneme.model;

import com.store.storedeneme.model.enums.City;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String identityNo;


    @Enumerated
    private City city;

    private LocalDate birthDate;

}
