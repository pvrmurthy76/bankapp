package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_ID")
    private Long id;

    private String branchName;

    private String branchCode;

    @OneToOne(cascade=CascadeType.ALL)
    private Address bankAddress;



}
