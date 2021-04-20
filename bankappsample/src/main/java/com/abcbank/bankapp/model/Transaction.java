package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRANSACTION_ID")
    private Long Id;

    private Double transactionAmount;

    private String transactionType;

    private Long accountNumber;

    @Temporal(TemporalType.TIME)
    private Date transactionDateTime;
}
