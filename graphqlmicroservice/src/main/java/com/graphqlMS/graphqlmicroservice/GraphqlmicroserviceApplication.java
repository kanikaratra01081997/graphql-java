package com.graphqlMS.graphqlmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlmicroserviceApplication.class, args);
	}

	// scalars --> end nodes , leaf nodes| can not go down any futher -> scaalry->depency provides other data types--> non negative int ,
	// config for scalar
	// make bean --> graphQlScalerType---> for input and output types [dto]

}
