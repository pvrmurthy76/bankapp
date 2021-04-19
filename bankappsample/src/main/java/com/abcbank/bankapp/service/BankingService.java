package com.abcbank.bankapp.service;

import com.abcbank.bankapp.model.Account;
import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface BankingService {

    public ResponseEntity<Object> createNewAccount(AccountInformation accountInformation);

    public List<AccountInformation> getAccountDetails(Double balance);
}
