package com.graphqlMS.graphqlmicroservice.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateBankAccountInput {
    @NotNull
    private String firstname;
    private String lastname;
}
