package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID")
    private Long Id;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
}
