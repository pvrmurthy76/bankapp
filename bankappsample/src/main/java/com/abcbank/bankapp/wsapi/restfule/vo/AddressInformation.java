package com.abcbank.bankapp.wsapi.restfule.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressInformation {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
}
