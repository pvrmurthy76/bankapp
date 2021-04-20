package com.abcbank.bankapp.service;

import com.abcbank.bankapp.model.Account;
import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;

import java.util.List;

import com.abcbank.bankapp.wsapi.restfule.vo.AmountTransfer;
import org.springframework.http.ResponseEntity;

public interface BankingService {

    public ResponseEntity<Object> createNewAccount(AccountInformation accountInformation);

    public AccountInformation getCurrentBalance(Long accountNumber);

    public List<AccountInformation> getAccountDetails(Double balance);

    public ResponseEntity<Object> transferAmount(AmountTransfer amountTransfer);
}
