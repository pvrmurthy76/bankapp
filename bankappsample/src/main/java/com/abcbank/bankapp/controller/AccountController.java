package com.abcbank.bankapp.controller;

import com.abcbank.bankapp.config.ApplicationConfig;
import com.abcbank.bankapp.model.Account;
import com.abcbank.bankapp.service.BankingServiceImpl;

import java.util.List;

import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;
import com.abcbank.bankapp.wsapi.restfule.vo.AmountTransfer;
import com.abcbank.bankapp.wsapi.restfule.vo.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    BankingServiceImpl bankingService;

    @GetMapping("/getaccounts")
    public List<AccountInformation> getAccountsGreaterThan(@RequestParam(value="balance", required = true) Double balance)
    {
        return bankingService.getAccountDetails(balance);
    }

    @GetMapping("/currentbalance")
    public AccountInformation getCurrentBalance(@RequestParam(value="accountnumber",required = true) Long accountnumber)
    {
        return bankingService.getCurrentBalance(accountnumber);
    }


    @PostMapping("/create")
    public ResponseEntity<Object> addNewAccount(@Valid @RequestBody AccountInformation accountInformation ) {
          return bankingService.createNewAccount(accountInformation);
    }

    @PutMapping("/transfer/otheraccount")
    public ResponseEntity<Object> transfer(@RequestBody AmountTransfer amountTransfer ) {
            return bankingService.transferAmount(amountTransfer);
    }

    @PutMapping("/transfer/amount")
    public ResponseEntity<Object> transfer(@RequestBody TransactionDetails transactionDetails ) {
            return bankingService.crdbTransaction(transactionDetails);
    }

}
