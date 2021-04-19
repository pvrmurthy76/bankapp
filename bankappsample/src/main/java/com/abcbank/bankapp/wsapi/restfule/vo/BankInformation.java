package com.abcbank.bankapp.wsapi.restfule.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankInformation {

    private String branchName;

    private String branchCode;

    private AddressInformation branchAddress;

}
