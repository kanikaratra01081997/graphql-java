package com.graphqlMS.graphqlmicroservice.execptionHandler;


import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@Component
//@Log4j2
//public class GraphqlExpceptionHandler {
//
//
//    @ExceptionHandler(GraphQLException.class)
//    // depency added for exception handling
//    public ThrowableGraphQLError handle(GraphQLException e)
//    {
//        return  new ThrowableGraphQLError(e);
//    }
//
//
//    @ExceptionHandler(RuntimeException.class)
//    public ThrowableGraphQLError handleRuntime(RuntimeException e)
//    {
//        return  new ThrowableGraphQLError(e, "Internal server Error");
//    }
//}
