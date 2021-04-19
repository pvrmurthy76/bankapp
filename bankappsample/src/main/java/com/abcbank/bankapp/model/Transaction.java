package com.abcbank.bankapp.model;

import javax.persistence.*;
import java.util.Date;

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
