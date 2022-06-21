package com.graphqlMS.graphqlmicroservice.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqlMS.graphqlmicroservice.model.BankAccount;
import com.graphqlMS.graphqlmicroservice.model.Client;
import com.graphqlMS.graphqlmicroservice.model.Currency;
import com.graphqlMS.graphqlmicroservice.model.dto.CreateBankAccountInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;


// bean validation done by adding hibernate bean validator
// constraint validation exception should be handled gracefully.

@Component
@Log4j2
@RequiredArgsConstructor
@Validated
public class BankAccountMutation implements GraphQLMutationResolver {

    private final Clock clock;

    public BankAccount createBankAccount(@Valid CreateBankAccountInput input) {
        log.info("bank account mutation called :{}", input.getFirstname()+" "+input.getLastname());
        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.INR)
                .createdAt(ZonedDateTime.now(clock))
                .createdOn(LocalDate.now(clock))
                .build();
    }



}
