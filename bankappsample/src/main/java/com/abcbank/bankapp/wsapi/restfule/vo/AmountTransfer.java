package com.abcbank.bankapp.wsapi.restfule.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmountTransfer {

    private Long fromAccountNumber;

    private Long toAccountNumber;

    private Double amount;
}
