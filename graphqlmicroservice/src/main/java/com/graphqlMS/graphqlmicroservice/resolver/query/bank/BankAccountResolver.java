package com.graphqlMS.graphqlmicroservice.resolver.query.bank;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqlMS.graphqlmicroservice.model.BankAccount;
import com.graphqlMS.graphqlmicroservice.model.Currency;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.UUID;

// whenever we want to query from root level we implement this
@Component
@Log4j2
public class BankAccountResolver implements GraphQLQueryResolver {


    // methods defined here should be having matching name as defined in schema file

    public BankAccount bankAccount(UUID id, DataFetchingEnvironment env) {
        // datafetching env is used to check and optimise our sql query for instance .
        // we make request for only those which client has requested , not all the fields.
        System.out.println(env.getSelectionSet().get());
        // requested object fields present
        System.out.println(  env.getSelectionSet().contains("id"));

        log.info("bank account query resolver");
        return BankAccount.builder().id(id)
                .currency(Currency.INR)
                .build();

    }

    // resolver in graphql works synchrnously
    //assume asset resolver after client resolver in bank api
    // first client resolver is completed fully then only  asset resolver is executed on the tomcat server

    // can be made asynchronous while making Completeable future and executor servic e--thread
    // can be made async asset rwsolver in a similar manner.
    // time outs /parallel executions.


}
