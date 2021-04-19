package com.abcbank.bankapp.controller;

import com.abcbank.bankapp.config.ApplicationConfig;
import com.abcbank.bankapp.model.Account;
import com.abcbank.bankapp.service.BankingServiceImpl;

import java.util.List;

import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    BankingServiceImpl bankingService;

    @GetMapping("/getAccounts")
    public List<AccountInformation> getAllAccounts(@RequestParam Double balance)
    {
        return bankingService.getAccountDetails(balance);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Object> addNewAccount(@RequestBody AccountInformation accountInformation ) {
          return bankingService.createNewAccount(accountInformation);
    }
}
