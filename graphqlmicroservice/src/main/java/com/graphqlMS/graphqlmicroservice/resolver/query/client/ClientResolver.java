package com.graphqlMS.graphqlmicroservice.resolver.query.client;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphqlMS.graphqlmicroservice.model.BankAccount;
import com.graphqlMS.graphqlmicroservice.model.Client;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Log4j2
public class ClientResolver implements GraphQLResolver<BankAccount> {
// model is mentioned to identify some of the field is required


    // this name should match with the field name specified in scehema file,
    // object of the model is passed here
    //DataFetcherResult<Client>
    public Client client(BankAccount bankAccount) {
        log.info("requesting client info :{}", bankAccount.getId());
        // written just to check
        //  throw new GraphQLException();

        Client data =  Client.builder().firstname("kanika").lastname("ratra").id(UUID.randomUUID()).build();
        // to carry partial result from any service or resolver
      //  return  new DataFetcherResult<Client>(data,new GenericGraphQLError("error has occured in fetching client info"),null );

        return  data;
    }
    // by default graphql exceptions are hidden
    // enable it explicitly;


}
