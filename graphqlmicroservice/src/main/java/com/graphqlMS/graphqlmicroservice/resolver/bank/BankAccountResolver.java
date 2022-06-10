package com.graphqlMS.graphqlmicroservice.resolver.bank;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqlMS.graphqlmicroservice.model.BankAccount;
import com.graphqlMS.graphqlmicroservice.model.Client;
import com.graphqlMS.graphqlmicroservice.model.Currency;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.UUID;

// whenever we want to query from root level we implement this
@Component
@Log4j2
public class BankAccountResolver implements GraphQLQueryResolver {


    // methods defined here should be having matching name as defined in schema file

    public BankAccount bankAccount(UUID id) {
        log.info("bank account query resolver");
        return BankAccount.builder().id(id)
                .currency(Currency.INR)
                .build();

    }


}
