package com.graphqlMS.graphqlmicroservice.resolver.client;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphqlMS.graphqlmicroservice.model.BankAccount;
import com.graphqlMS.graphqlmicroservice.model.Client;
import graphql.GraphQLException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Log4j2
public class ClientResolver implements GraphQLResolver<BankAccount> { // model is mentioned to identify some of the field is required


    // this name should match with the field name specified in scehema file,
    // object of the model is passed here
    public Client client(BankAccount bankAccount)
    {
        log.info("requesting client info :{}", bankAccount.getId());
        throw new GraphQLException();
      //  return Client.builder().firstname("kanika").lastname("ratra").id(UUID.randomUUID()).build();

    }

    // by default graphql exceptions are hidden
    // enable it explicitly;




}
