package com.graphqlMS.graphqlmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {

    private UUID id;
    private Client client;
    private Currency currency;
    private ZonedDateTime createdAt;
    private LocalDate createdOn;

}
