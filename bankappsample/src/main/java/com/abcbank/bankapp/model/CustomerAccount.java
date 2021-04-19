package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ACCOUNT_ID")
    private Long Id;

    private Long customerId;

    private Long accountId;
}
