package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Long id;

    private String name;

    private String contactNumber;

    @OneToOne
    private Address customerAddress;

    public String toString() {
        return id+","+name+","+contactNumber+"\n";
    }
}
