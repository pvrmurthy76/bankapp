package com.abcbank.bankapp.wsapi.restfule.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInformation {
    @NotEmpty
    private String name;

    private String contactNumber;

    private AddressInformation customerAddress;
}
