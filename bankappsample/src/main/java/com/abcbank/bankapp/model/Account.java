package com.abcbank.bankapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long accountNumber;

    private String accountType;

    private String accountStatus;

    private Double balance;

    @ManyToOne(cascade=CascadeType.ALL)
    private BankDetail bankDetail;

    @Temporal(TemporalType.TIME)
    private Date createdDateTime;

    @Temporal(TemporalType.TIME)
    private Date updatedDateTime;

    public String toString() {
        return  id+","+accountNumber+","+accountType+","+accountStatus+","+balance+","+createdDateTime+"\n";
    }
}
