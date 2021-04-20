package com.abcbank.bankapp.wsapi.restfule.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetails {

    private Long accountNumber;

    private Double amount;

    private String transactionType;

    private Date transactionDate;
}
