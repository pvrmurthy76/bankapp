package com.abcbank.bankapp.wsapi.restfule.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountInformation {

    private String name;

    private String contactNumber;

    private AddressInformation customerAddress;

    private Long accountNumber;

    private BankInformation bankInformation;

    private String accountStatus;

    private String accountType;

    private Double balance;

    private Date accountCreated;
}
