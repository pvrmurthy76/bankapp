package com.abcbank.bankapp.wsapi.restfule.vo;

import java.util.Date;

import com.abcbank.bankapp.service.util.TransactionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountInformation extends CustomerInformation{

    @NotNull
    private Long accountNumber;

    private BankInformation bankInformation;

    private String accountStatus;

    private String accountType;

    private Double balance;

    private Date accountCreated;
}
